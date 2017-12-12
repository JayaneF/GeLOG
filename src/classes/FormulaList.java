package classes;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "formulas")
@XmlAccessorType (XmlAccessType.FIELD)
public class FormulaList {
	
    	@XmlElement(name = "formula")
	private Set<Formula> formulas;
	
	public Set<Formula> getFormulas() {
		return formulas;
	}
	
	public void setFormulas(Set<Formula> formulas) {
		this.formulas = formulas;
	}

}
