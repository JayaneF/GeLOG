/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author jayane
 */
public class GerandoDeExercicioController {      
    
      
	private Random rnd = new Random(System.currentTimeMillis());
	private int maximo = 1;
	private int minimo = 0;
	private int random = -1;
	 
	public Set<Formula> gerarFormulas(Map<String, ParametroEntry> predicados, Map<String, ParametroEntry> operadores) {
		Set<Formula> formulas = new HashSet<>();
		
		ParametroEntry parenteses = null;
		if(operadores.containsKey("(")) {
			parenteses = operadores.get("(");
			operadores.remove("(");
		}
		
		ParametroEntry negacao = null;
		if(operadores.containsKey("~")) {
			negacao = operadores.get("~");
			operadores.remove("~");
		}
		
		if(predicados.isEmpty() || operadores.isEmpty()) {
			return formulas;
		}
		
		
		for (int i = 0; i < 5; i++) {
			formulas.add(gerarFormula(predicados, operadores, negacao, parenteses, random));
			formulas.add(gerarFormula(predicados, operadores, negacao, parenteses, maximo));
			formulas.add(gerarFormula(predicados, operadores, negacao, parenteses, minimo));
		}
		
		return formulas;
	}
	
	
	private Formula gerarFormula(Map<String, ParametroEntry> predicados, Map<String, ParametroEntry> operadores,
			ParametroEntry negacao, ParametroEntry parenteses, int modo) {
		List<String> predicadosList = extrairLista(predicados);
		List<String> operadoresList = extrairLista(operadores);
		return gerarFormula(predicadosList, operadoresList, negacao, parenteses, modo);
	}


	private Formula gerarFormula(List<String> predicadosList, List<String> operadoresList, ParametroEntry negacao,
			ParametroEntry parenteses, int modo) {
		
		StringBuilder sb = new StringBuilder();
		int quantidadeParenteses = getQuantidade(parenteses, modo);
		int quantidadeNegacao = getQuantidade(negacao, modo);
		boolean parentesesAdicionado = false;
		
		
		for (int i = 0; i < predicadosList.size() -1; i++) {
			int quantidadePredicados = predicadosList.size() - i;
			
			boolean adicionarParenteses = calcularAdicionarParenteses(quantidadeParenteses, quantidadePredicados, parentesesAdicionado);
			boolean adicionarNegacao = calcularAdicionarNegacao(quantidadeNegacao ,quantidadePredicados, quantidadeParenteses);
			
			String predicado = predicadosList.get(i);
			String operador = operadoresList.get(i % operadoresList.size());
			
			if(adicionarParenteses) {
				switch (decidirNegacao(adicionarNegacao)) {
				case 0:
					sb.append("(");
					sb.append("~");
					quantidadeNegacao--;
					adicionarNegacao = false;
					break;
				case 1:
					sb.append("~");
					quantidadeNegacao--;
					adicionarNegacao = false;
				default:
					sb.append("(");
					break;
				}
				
				parentesesAdicionado = true;
				adicionarParenteses = false;
				sb.append(predicado);
				sb.append(operador);
				quantidadeParenteses--;
			} else {
				if(adicionarNegacao) {
					sb.append("~");
					quantidadeNegacao--;
				}
				
				sb.append(predicado);
				
				if(parentesesAdicionado && rnd.nextFloat() > 0.5) {
					sb.append(")");
					parentesesAdicionado = false;
				}
				sb.append(operador);
			}
			
		}
		
		if(quantidadeNegacao > 0) {
			sb.append("~");
		}
		
		sb.append(predicadosList.get(predicadosList.size() -1));
		
		if(parentesesAdicionado) {
			sb.append(")");
		}
		
		return new Formula(sb.toString());
		
	}

	private int getQuantidade(ParametroEntry parametro, int modo) {
		if(parametro == null)
			return 0;
		if(modo == maximo) {
			return  parametro.getMax();
		} else if(modo == minimo) {
			return parametro.getMin();
		}
		return getRandom(parametro);
	}


	private int decidirNegacao(boolean adicionarNegacao) {
		if(!adicionarNegacao) 
			return -1;
		return rnd.nextFloat() > 0.5 ? 0 : 1;
	}


	private boolean calcularAdicionarNegacao(int quantidadeNegacao, int quantidadePredicados, int quantidadeParenteses) {
		if (quantidadeNegacao > 0) {
			return rnd.nextFloat() <= quantidadeNegacao / (quantidadePredicados + quantidadeParenteses);
		}
		return false;
	}

	private boolean calcularAdicionarParenteses(int quantidadeParenteses, int quantidadePredicados, boolean parentesesAdicionado) {
		if (quantidadeParenteses > 0 && !parentesesAdicionado) {
			if(quantidadePredicados - quantidadeParenteses <= 1)
				return true;
			return rnd.nextFloat() <= 0.5;
		}
		return false;
	}


	private List<String> extrairLista(Map<String, ParametroEntry> predicados) {
		List<String> resultado = new ArrayList<>();
		for (Entry<String, ParametroEntry> predicado : predicados.entrySet()) {
			int quantidade = getRandom(predicado.getValue());
			for (int i = 0; i < quantidade; i++) {
				resultado.add(predicado.getKey());
			}
		}
		Collections.shuffle(resultado);
		return resultado;
	}
	
	
	private int getRandom(ParametroEntry value) {
		if(value == null) return 0;
		int random = rnd.nextInt(value.getMax() +1);
		return random < value.getMin() ? value.getMin() : random;
	}


	public Collection<? extends Formula> gerarFormulasFBF(Map<String, ParametroEntry> predicados,
		Map<String, ParametroEntry> operadores) {
	    Set<Formula> formulas = new HashSet<>();
		
	    ParametroEntry parenteses = null;
	    if(operadores.containsKey("(")) {
		parenteses = operadores.get("(");
		operadores.remove("(");
	    }
		
	    ParametroEntry negacao = null;
	    if(operadores.containsKey("~")) {
		negacao = operadores.get("~");
		operadores.remove("~");
	    }
		
	    if(predicados.isEmpty() || operadores.isEmpty()) {
		return formulas;
	    }
		
		
	    for (int i = 0; i < 5; i++) {
		formulas.add(gerarFormulaFBF(predicados, operadores, negacao, parenteses, random));
		formulas.add(gerarFormulaFBF(predicados, operadores, negacao, parenteses, maximo));
		formulas.add(gerarFormulaFBF(predicados, operadores, negacao, parenteses, minimo));
	    }
	    return formulas;
	}


	private Formula gerarFormulaFBF(Map<String, ParametroEntry> predicados, Map<String, ParametroEntry> operadores,
		ParametroEntry negacao, ParametroEntry parenteses, int modo) {
	    List<String> predicadosList = extrairLista(predicados);
	    List<String> operadoresList = extrairLista(operadores);
	    return gerarFormulaFBF(predicadosList, operadoresList, negacao, parenteses, modo);
	    
	}


	private Formula gerarFormulaFBF(List<String> predicadosList, List<String> operadoresList,
		ParametroEntry negacao, ParametroEntry parenteses, int modo) {
	
	    StringBuilder sb = new StringBuilder();
	    int quantidadeParenteses = getQuantidade(parenteses, modo);
	    int quantidadeNegacao = getQuantidade(negacao, modo);
	    
	    for (int i = 0; i < predicadosList.size(); i++) {
		boolean adicionaPredicado = true;
		boolean adicionaOperador = operadoresList.size() > 0;
		boolean adicionaNegacao = quantidadeNegacao > 0;
		boolean adicionaParenteses = quantidadeParenteses > 0;
		for (int j = 0; j < 4; j++) {
		    int random = rnd.nextInt(4);
		    
		    if(random == 3) {
			if(adicionaParenteses) {
			    adicionaParenteses = false;
			    quantidadeParenteses--;
			    sb.append(rnd.nextBoolean() ? "(" : ")");
			} else {
			    random--;
			}
		    }
		    
		    if(random == 2) {
			if(adicionaNegacao) {
			    adicionaNegacao = false;
			    quantidadeNegacao--;
			    sb.append("~");
			} else {
			    random--;
			}
		    }
		    
		    if(random == 1) {
			if(adicionaOperador) {
			    adicionaOperador = false;
			    sb.append(operadoresList.get(i % operadoresList.size()));
			} else {
			    random--;
			}
		    }
		    
		    if(random == 0) {
			if(adicionaPredicado) {
			    adicionaPredicado = false;
			    sb.append(predicadosList.get(i));
			}
		    }
		}
	    }
	    
	    return new Formula(sb.toString());
	}


	private int getProximoElemento(boolean adicionaPredicado, boolean adicionaOperador, boolean adicionaNegacao, boolean adicionaParenteses) {
	    int random = 4;
	    
	    do {
		random = rnd.nextInt(4);
		if(random == 3 && !adicionaParenteses)
		    random--;
		if(random == 2 && !adicionaNegacao)
		    random--;
		if(random == 1 && !adicionaOperador)
		    random--;
		if(random == 0 && !adicionaPredicado)
		    random--;
	    } while(random < 0);
	    return random;
	}

}
