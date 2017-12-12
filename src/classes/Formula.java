/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jayane
 */
@XmlRootElement(name = "formula")
@XmlAccessorType (XmlAccessType.FIELD)
public class Formula {
    
    private String formula;
    private String complexidadeTabelaVerdade;
    private String complexidadeProposicao;
    
	
	public Formula() {
	}
    
	public Formula(String formula) {
		this.formula = formula;
		this.complexidadeTabelaVerdade = "não definida";
		this.complexidadeProposicao = "não definida";
	}
	
	public void setComplexidadeTabelaVerdade(String complexidade) {
		this.complexidadeTabelaVerdade = complexidade;
	}
	
	public String getComplexidadeTabelaVerdade() {
		return complexidadeTabelaVerdade;
	}
	
	public String getFormula() {
		return formula;
	}
	
	public String getComplexidadeArgumentos() {
	    return complexidadeProposicao;
	}

	public void setComplexidadeArgumentos(String complexidadeProposicao) {
	    this.complexidadeProposicao = complexidadeProposicao;
	}
	
	
	@Override
	public String toString() {
		return String.format(formula, complexidadeTabelaVerdade == null ? "Não definida" : complexidadeTabelaVerdade);
	}//"formula : %s [Complexidade: %s]",
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formula == null) ? 0 : formula.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formula other = (Formula) obj;
		if (formula == null) {
			if (other.formula != null)
				return false;
		} else if (!formula.equals(other.formula))
			return false;
		return true;
	}

}
