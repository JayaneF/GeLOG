import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jay
 */
public class Gerando {      
    
      int P, Q, R, T,neg, conj, dis, imp,bi, parentesesMinimo, parentesesMaximo, minP, minQ, minR, minT, maxP, maxQ, maxR, maxT, minNeg, minConj, minDis, minImp, minBi, maxNeg, maxConj, maxDis, maxImp, maxBi;
        String  conjPremissa="",parte1="", parte2="", parte3="", parte4="", parte5="", msgP="", msgQ="", msgR="", msgT="", conjOperadores="", conjLetras="", msgNeg="", msgDis="", msgConj="", msgImp="", msgBi="";
       //array para a quantidade max de itens escolhidos pelo usuário
        ArrayList<String> letras = new ArrayList<String>();
        ArrayList<String> operadores = new ArrayList<String>();
         ArrayList<String> novaListaMax = new ArrayList<String>();//com parenteses
         ArrayList<String> novaListaMax1 = new ArrayList<String>();
        
        
        //array para a quantidade min de itens escolhidos
        ArrayList<String> letrasMin = new ArrayList<String>();
        ArrayList<String> operadoresMin = new ArrayList<String>();
        ArrayList<String> novaListaMin = new ArrayList<String>();//com parenteses
        ArrayList<String> novaListaMin1 = new ArrayList<String>();
        
        //array para quantidade medianda de itens
        ArrayList<String> letrasMed = new ArrayList<String>();
        ArrayList<String> operadoresMed = new ArrayList<String>();
        
        ArrayList<String> opnegacaoMin = new ArrayList<String>();
        ArrayList<String> opnegacaoMax = new ArrayList<String>();
        
        ArrayList<String> premissa = new ArrayList<String>();
        
        ArrayList<String> parentesesMin = new ArrayList<String>();
        ArrayList<String> parentesesMax = new ArrayList<String>();
        
        ArrayList formulas = new ArrayList(letras.size()+ operadores.size());

        
        
      
    
    
    
      //---------Itens com quantidade minima---------------
      
       Collections.shuffle(letrasMin);
       System.out.print(letrasMin.toString());       
       Collections.shuffle(operadoresMin);
       System.out.print(operadoresMin.toString());
       
       System.out.println(opnegacaoMin.toString());
      
       
       //----------------Formula sem parenteses com quantidade minima
       
       int l = 0;

    int quantidadeDeNegacao2 = opnegacaoMax.size();

    while(l < letrasMin.size() - 1) { // não vai até o final do array de letras, pq os operadores tem sempre -1
	String nome6 = letrasMin.get(l);
	String nome7 = operadoresMin.get(l);
//se houver negação
	if(quantidadeDeNegacao2 > 0){
		int quantidadeDeLetras2 = letrasMin.size() - l;//quantas letras disponiveis para inserir a neg
                //probabilidade de adc
		boolean adicionaNegacao2 = new Random().nextFloat() <= quantidadeDeNegacao2 / quantidadeDeLetras2;

		if(adicionaNegacao2) {
			novaListaMin.add("~");//add negação
			quantidadeDeNegacao2--;
		}	
	}
	novaListaMin.add(nome6); //letra
	novaListaMin.add(nome7); //operador
	l++;
}

// Se sobrou uma negação adiciona
     if(quantidadeDeNegacao2 > 0) {
	novaListaMin.add("~");
     } 
//estava pegando a posição com zero e ñão havia condições pra ela
// ai gora adiciona a última letra que fico
     
     if(l != 0){
    String nome8 = letrasMin.get(l);
    novaListaMin.add(nome8);}
       
    String item6="";
    
    for(int j=0; j<novaListaMin.size(); j++){
        item6 = item6 + novaListaMin.get(j);
    } 
       
     
            //-------------------------------------Formula completa com quantidade min--------------- 
            Collections.shuffle(letrasMin);
           // System.out.print(letrasMin.toString());       
            Collections.shuffle(operadoresMin);
           // System.out.print(operadoresMin.toString());
    
                int r = 0;
		Random rnd1 = new Random();
		int quantidadeDeNegacao3 = opnegacaoMin.size();
		int quantidadeDeParenteses3 = parentesesMin.size() / 2;
		boolean parentesesAdicionado3 = false;
                
                
                
                    while (r < letrasMin.size() - 1) { // não vai até o final do array de
										// letras, pq os operadores tem sempre
										// -1
			String nome7 = letrasMin.get(r);
			String nome9 = operadoresMin.get(r);

			boolean adicionarParenteses3 = false;
			
			if (quantidadeDeParenteses3 > 0 && !parentesesAdicionado3) {
				int quantidadeDeOperadores3 = operadoresMin.size();
				adicionarParenteses3 = rnd1.nextFloat() <= (quantidadeDeOperadores3 - 1) / quantidadeDeParenteses3;
			}

			boolean adicionaNegacao3 = false;
			if (quantidadeDeNegacao3 > 0) {
				int quantidadeDeLetras3 = letrasMin.size() - r;
				// adc aleatoriamente onde vai ter negacao
				adicionaNegacao3 = rnd1.nextFloat() <= quantidadeDeNegacao3 / quantidadeDeLetras3;
			}
			
			
			if(adicionarParenteses3) {
				if(adicionaNegacao3) {
					if(rnd1.nextFloat() > 0.5) {
						novaListaMin1.add("(");
						adicionarParenteses3 = false;
					}
					novaListaMin1.add("~");
					quantidadeDeNegacao3--;
				}
				
				if(adicionarParenteses3) {
					novaListaMin1.add("(");
				}
				adicionarParenteses3 = false;
				novaListaMin1.add(nome7);
				novaListaMin1.add(nome9);
				parentesesAdicionado3 = true;
			} else {
				if(adicionaNegacao3) {
					novaListaMin1.add("~");
					quantidadeDeNegacao3--;
				}
				
				novaListaMin1.add(nome7);
				if (parentesesAdicionado3) {
					novaListaMin1.add(")");
					parentesesAdicionado3 = false;
				}
				novaListaMin1.add(nome9);
				
			}

			r++;
		}

		// Se sobrou uma negação adiciona
		if (quantidadeDeNegacao3 > 0) {
			novaListaMin1.add("~");
		}

		// agora adiciona a última letra que ficou
                if(r != 0){
		String nome10 = letrasMin.get(r);
		novaListaMin1.add(nome10);}
                
                if(parentesesAdicionado3){
			novaListaMin1.add(")");
                }
    
		String item7= "";

		for (int s = 0; s < novaListaMin1.size(); s++) {
			item7 = item7 + novaListaMin1.get(s);
                      //  System.out.print(item);
		}
                
                     //---------------------------------------------------------------------------
       
      
    
    
    //-----------------------Itens MAX--------------------------------
       //embaralhando as letras e os arrays Max
       Collections.shuffle(letras);
      //System.out.print(letras.toString());       
       Collections.shuffle(operadores);
      // System.out.print(operadores.toString());
       
       System.out.println(opnegacaoMax.toString());
      //-------------Formula sem parenteses com quantidades max-------------------------------
       int i = 0;

    int quantidadeDeNegacao1 = opnegacaoMax.size();

    while(i < letras.size() - 1) { // não vai até o final do array de letras, pq os operadores tem sempre -1
	String nome3 = letras.get(i);
	String nome4 = operadores.get(i);

	if(quantidadeDeNegacao1 > 0){
		int quantidadeDeLetras = letras.size() - i;
                //adc aleatoriamente onde vai ter negacao
		boolean adicionaNegacao1 = new Random().nextFloat() <= quantidadeDeNegacao1 / quantidadeDeLetras;

		if(adicionaNegacao1) {
			novaListaMax1.add("~");
			quantidadeDeNegacao1--;
		}	
	}
	novaListaMax1.add(nome3);
	novaListaMax1.add(nome4);
	i++;
}

// Se sobrou uma negação adiciona
     if(quantidadeDeNegacao1 > 0) {
	novaListaMax1.add("~");
     } 

// agora adiciona a última letra que ficou
     if(i != 0){
    String nome5 = letras.get(i);
    novaListaMax1.add(nome5);}
       
    String item1="";
    
    for(int j=0; j<novaListaMax1.size(); j++){
        item1 = item1 + novaListaMax1.get(j);
    }
    
    
         Collections.shuffle(letras);
         System.out.print(letras.toString());       
         Collections.shuffle(operadores);
         System.out.print(operadores.toString());   
     
     //-------------------------------------Formula completa com quantidade max--------------- 
                int k = 0;
		Random rnd = new Random();
		int quantidadeDeNegacao = opnegacaoMax.size();
		int quantidadeDeParenteses = parentesesMax.size() / 2;
		boolean parentesesAdicionado = false;
                
                
                
                    while (k < letras.size() - 1) { // não vai até o final do array de
										// letras, pq os operadores tem sempre
										// -1
			String nome1 = letras.get(k);
			String nome2 = operadores.get(k);

			boolean adicionarParenteses = false;
			
			if (quantidadeDeParenteses > 0 && !parentesesAdicionado) {
				int quantidadeDeOperadores = operadores.size();
				adicionarParenteses = rnd.nextFloat() <= (quantidadeDeOperadores - 1) / quantidadeDeParenteses;
			}

			boolean adicionaNegacao = false;
			if (quantidadeDeNegacao > 0) {
				int quantidadeDeLetras = letras.size() - k;
				// adc aleatoriamente onde vai ter negacao
				adicionaNegacao = rnd.nextFloat() <= quantidadeDeNegacao / quantidadeDeLetras;
			}
			
			
			if(adicionarParenteses) {
				if(adicionaNegacao) {
					if(rnd.nextFloat() > 0.5) {
						novaListaMax.add("(");
						adicionarParenteses = false;
					}
					novaListaMax.add("~");
					quantidadeDeNegacao--;
				}
				
				if(adicionarParenteses) {
					novaListaMax.add("(");
				}
				adicionarParenteses = false;
				novaListaMax.add(nome1);
				novaListaMax.add(nome2);
				parentesesAdicionado = true;
			} else {
				if(adicionaNegacao) {
					novaListaMax.add("~");
					quantidadeDeNegacao--;
				}
				
				novaListaMax.add(nome1);
				if (parentesesAdicionado) {
					novaListaMax.add(")");
					parentesesAdicionado = false;
				}
				novaListaMax.add(nome2);
				
			}

			k++;
		}

		// Se sobrou uma negação adiciona
		if (quantidadeDeNegacao > 0) {
			novaListaMax.add("~");
		}

		// agora adiciona a última letra que ficou
                if( k !=0){
		String nome1 = letras.get(k);
		novaListaMax.add(nome1);}
                
                if(parentesesAdicionado){
			novaListaMax.add(")");
                }
    
		String item = "";

		for (int m = 0; m < novaListaMax.size(); m++) {
			item = item + novaListaMax.get(m);
                      //  System.out.print(item);
		}
                
                
    //----------------------------------------------------------------------------------------            
               formulas.add(item6);
               formulas.add(item7);
               formulas.add(item);
               formulas.add(item1);
                
                
                String formula ="";
                for(int g=0; g<formulas.size(); g++){
                    formula = formula + formulas.get(g) + "\n";                 
                }
                System.out.println("1. Desenvolva a tabela verdade das fórmulas abaixo: ");
                System.out.println(formula);
       
              //CampoTeste.setText("Formula1: " + item6 + "FormulaMinParenteses:" + item7);    
   
      
             
       

}

