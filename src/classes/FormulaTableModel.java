/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jayane
 */
public class FormulaTableModel extends AbstractTableModel{
    //o set altera algo?
    private List<Formula> formulas = new ArrayList<>();
    private String[] colunas = {"Fórmulas", "Tabela Verdade(Complexidade)", "Formalizar Proposição(Complexidade)"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    
    @Override
    public int getRowCount() {
        return formulas.size();
        }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }
    
    public List<Formula> getFormulas() {
	return formulas;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return formulas.get(linha).getFormula();
            case 1:
                return formulas.get(linha).getComplexidadeTabelaVerdade();
            case 2:
        	return formulas.get(linha).getComplexidadeArgumentos();
        }
         return null;       
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return (columnIndex == 1 || columnIndex ==2);
     
    }
    
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	if(! (value.toString().length()==1 && "123".contains(value.toString()))) {
	    return;
	}
	switch (columnIndex) {
	case 1:
	    formulas.get(rowIndex).setComplexidadeTabelaVerdade(value.toString());
	    break;
	case 2:
	    formulas.get(rowIndex).setComplexidadeArgumentos(value.toString());

	default:
	    break;
	}
    }
    
    public void addRow(Formula f){
        this.formulas.add(f);
        this.fireTableDataChanged();           
    }

    public void addRow(Object formula) {
       // this.formulas.add(null)
    }
    
     public void setListas(List formulas) {
        this.formulas = formulas;
    }
}
   

