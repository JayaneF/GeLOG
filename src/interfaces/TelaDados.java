package interfaces;

import classes.Formula;
import classes.FormulaList;
import classes.GerandoDeExercicioController;
import classes.ParametroEntry;
import classes.VerificacaoException;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javafx.collections.ArrayChangeListener;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayane
 */
public class TelaDados extends javax.swing.JInternalFrame {

    /**
     * C\reates new form i
     */
       
	
	Set<Formula> formulas = new HashSet();    
	Set<Formula> formulasFBF = new HashSet();
       
        
        
    public TelaDados() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonP = new javax.swing.JRadioButton();
        jRadioButtonQ = new javax.swing.JRadioButton();
        jRadioButtonR = new javax.swing.JRadioButton();
        jRadioButtonT = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMinP = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMaxP = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxMinQ = new javax.swing.JComboBox();
        jComboBoxMInR = new javax.swing.JComboBox();
        jComboBoxMinT = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxMaxQ = new javax.swing.JComboBox();
        jComboBoxMaxR = new javax.swing.JComboBox();
        jComboBoxMaxT = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonNeg = new javax.swing.JRadioButton();
        jRadioButtonCon = new javax.swing.JRadioButton();
        jRadioButtonDis = new javax.swing.JRadioButton();
        jRadioButtonImp = new javax.swing.JRadioButton();
        jRadioButtonBi = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxMinNeg = new javax.swing.JComboBox();
        jComboBoxMinCon = new javax.swing.JComboBox();
        jComboBoxMinDis = new javax.swing.JComboBox();
        jComboBoxMinImp = new javax.swing.JComboBox();
        jComboBoxMinBi = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxMaxNeg = new javax.swing.JComboBox();
        jComboBoxMaxCon = new javax.swing.JComboBox();
        jComboBoxMaxDis = new javax.swing.JComboBox();
        jComboBoxMaxImp = new javax.swing.JComboBox();
        jComboBoxMaxBI = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoGerar = new javax.swing.JButton();
        jComboBoxQuantParentesesMin = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxQuantparentesesMax = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        JButton2 = new javax.swing.JButton();
        botaoVisualizar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel2.setText("Defina quais proposições atômicas e suas respectivas ocorrências:");

        jRadioButtonP.setText("P");
        jRadioButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPActionPerformed(evt);
            }
        });

        jRadioButtonQ.setText("Q");

        jRadioButtonR.setText("R");
        jRadioButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRActionPerformed(evt);
            }
        });

        jRadioButtonT.setText("T");

        jLabel3.setText("Nº mínimo de ocorrência:");

        jComboBoxMinP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));
        jComboBoxMinP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMinPActionPerformed(evt);
            }
        });

        jLabel4.setText("Nº máximo de ocorrências:");

        jComboBoxMaxP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jLabel5.setText("Nº mínimo de ocorrência:");

        jLabel6.setText("Nº mínimo de ocorrência:");

        jLabel7.setText("Nº mínimo de ocorrência:");

        jComboBoxMinQ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMInR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMinT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jLabel8.setText("Nº máximo de ocorrências:");

        jLabel9.setText("Nº máximo de ocorrências:");

        jLabel10.setText("Nº máximo de ocorrências:");

        jComboBoxMaxQ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMaxR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMaxT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jLabel11.setText("Defina quais operadores e suas respectivas ocorrências:");

        jRadioButtonNeg.setText("~");

        jRadioButtonCon.setText("^");

        jRadioButtonDis.setText("v");

        jRadioButtonImp.setText("→ ");

        jRadioButtonBi.setText("↔");

        jLabel12.setText("Nº mínimo de ocorrência:");

        jLabel13.setText("Nº mínimo de ocorrência:");

        jLabel14.setText("Nº mínimo de ocorrência:");

        jLabel15.setText("Nº mínimo de ocorrência:");

        jLabel16.setText("Nº mínimo de ocorrência:");

        jComboBoxMinNeg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMinCon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMinDis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMinImp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMinBi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jLabel17.setText("Nº máximo de ocorrências:");

        jLabel18.setText("Nº máximo de ocorrências:");

        jLabel19.setText("Nº máximo de ocorrências:");

        jLabel20.setText("Nº máximo de ocorrências:");

        jLabel21.setText("Nº máximo de ocorrências:");

        jComboBoxMaxNeg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMaxCon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMaxDis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMaxImp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jComboBoxMaxBI.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));

        jLabel22.setText("Quantos parênteses?");

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoGerar.setText("Gerar");
        botaoGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarActionPerformed(evt);
            }
        });

        jComboBoxQuantParentesesMin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "2", "4", "6", "8" }));

        jLabel23.setText("Máximo");

        jComboBoxQuantparentesesMax.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "2", "4", "6", "8", " " }));

        jLabel24.setText("Mínimo");

        JButton2.setText("Salvar");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });

        botaoVisualizar.setText("Visualizar Exercícios");
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMinT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonR)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMInR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel9))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonP)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMinP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonQ)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMinQ, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxMaxT, 0, 57, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaxR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaxQ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaxP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(botaoGerar)
                                    .addGap(180, 180, 180)
                                    .addComponent(botaoVisualizar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonCon)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxMinCon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel18))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonDis)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxMinImp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jComboBoxMinDis, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(JButton2)
                                                        .addComponent(jLabel16))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jComboBoxMinBi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel20))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxMaxDis, 0, 57, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaxCon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaxImp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMaxBI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jRadioButtonBi)
                            .addComponent(jRadioButtonImp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonNeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMinNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMaxNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoSair))
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxQuantparentesesMax, 0, 52, Short.MAX_VALUE)
                                    .addComponent(jComboBoxQuantParentesesMin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(84, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonP)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMinP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMaxP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxMinQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxMaxQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxQuantParentesesMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonR)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMInR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxMaxR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jComboBoxQuantparentesesMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMaxT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonT)
                        .addComponent(jLabel7)
                        .addComponent(jComboBoxMinT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNeg)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxMinNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxMaxNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCon)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxMinCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBoxMaxCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxMaxDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jComboBoxMinDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jRadioButtonDis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonImp)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxMinImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBoxMaxImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonBi)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jComboBoxMinBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21)
                    .addComponent(jComboBoxMaxBI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoGerar)
                        .addComponent(JButton2)
                        .addComponent(botaoVisualizar))
                    .addComponent(botaoSair))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setText("REQUISITOS DAS FÓRMULAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
        List<Formula> todasFormulas = new ArrayList<>();
        todasFormulas.addAll(formulas);
        todasFormulas.addAll(formulasFBF);
        Collections.shuffle(todasFormulas);
        TelaTiposDeListas telaTipos1 = new TelaTiposDeListas();
        telaTipos1 = new TelaTiposDeListas(formulas, todasFormulas);
        
        TelaPrincipal.jDesktopPane1.add(telaTipos1);
       
        telaTipos1.setVisible(true);
        
    }//GEN-LAST:event_botaoVisualizarActionPerformed

    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton2ActionPerformed
        botaoSalvarActionPerformed(evt);
        JOptionPane.showMessageDialog(null, "Salvo!");
    }//GEN-LAST:event_JButton2ActionPerformed

    private void botaoGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarActionPerformed
        try {
            Map<String, ParametroEntry> predicados = criarMapaDePredicados();
            Map<String, ParametroEntry> operadores = criarMapaDeOperadores();

            Map<String, ParametroEntry> operadoresFBF = new HashMap<>(operadores);

            GerandoDeExercicioController g = new GerandoDeExercicioController();
            formulas.addAll(g.gerarFormulas(predicados, operadores));
            formulasFBF.addAll(g.gerarFormulasFBF(predicados, operadoresFBF));
            System.out.println(formulas);
            System.out.println(formulasFBF);
            
            if( formulas.isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione elementos suficientes para gerar os exercícios!");
       
            }else{
                JOptionPane.showMessageDialog(null, "Gerado!"); 
            };
               
           
        } catch (VerificacaoException e) {
        }

    }//GEN-LAST:event_botaoGerarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed

        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void jComboBoxMinPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMinPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMinPActionPerformed

    private void jRadioButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonRActionPerformed

    private void jRadioButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPActionPerformed

    }//GEN-LAST:event_jRadioButtonPActionPerformed

    
    private Map<String, ParametroEntry> criarMapaDePredicados() throws VerificacaoException {
    	Map<String, ParametroEntry> parametros = new HashMap<>();
    	
    	if(jRadioButtonP.isSelected()){
            int min = jComboBoxMinP.getSelectedIndex();
            int max = jComboBoxMaxP.getSelectedIndex();
            
            verificarQuantidade("P", min, max);
            parametros.put("P", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonQ.isSelected()){
        	int min = jComboBoxMinQ.getSelectedIndex();
            int max = jComboBoxMaxQ.getSelectedIndex();  
            verificarQuantidade("Q", min, max);
            parametros.put("Q", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonR.isSelected()){
        	int min = jComboBoxMInR.getSelectedIndex();
            int max = jComboBoxMaxR.getSelectedIndex();
            verificarQuantidade("R", min, max);
            parametros.put("R", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonT.isSelected()){
        	int min = jComboBoxMinT.getSelectedIndex();
            int max = jComboBoxMaxT.getSelectedIndex();
            verificarQuantidade("T", min, max);
            parametros.put("T", new ParametroEntry(min, max));
        }
    	
		return parametros;
	}
    
   
    
    private void verificarQuantidade(String var, int min, int max) throws VerificacaoException {
    	if(min==0 && max == 0 ){
            JOptionPane.showMessageDialog(null, "Se selecionou " + var + ", escolhe ao menos 1 na quantidade  mínima ou máxima!");
            throw new VerificacaoException();
        }
	}
 
	private Map<String, ParametroEntry> criarMapaDeOperadores() throws VerificacaoException {
    	Map<String, ParametroEntry> parametros = new HashMap<>();
    	
    	
    	if(jRadioButtonNeg.isSelected()){
        	int min = jComboBoxMinNeg.getSelectedIndex();
            int max = jComboBoxMaxNeg.getSelectedIndex();
            
            verificarQuantidade("negação", min, max);
            parametros.put("~", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonCon.isSelected()){
            int min = jComboBoxMinCon.getSelectedIndex();
            int max = jComboBoxMaxCon.getSelectedIndex();      
            verificarQuantidade("conjunção", min, max);
            parametros.put("^", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonDis.isSelected()){
        	int min = jComboBoxMinDis.getSelectedIndex();
            int max = jComboBoxMaxDis.getSelectedIndex();
            verificarQuantidade("disjunção", min, max);
            parametros.put("v", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonImp.isSelected()){
        	int min = jComboBoxMinImp.getSelectedIndex();
            int max = jComboBoxMaxImp.getSelectedIndex();
            verificarQuantidade("implicação", min, max);
            parametros.put("->", new ParametroEntry(min, max));
        }
    	
    	if(jRadioButtonBi.isSelected()){
        	int min = jComboBoxMinBi.getSelectedIndex();
            int max = jComboBoxMaxBI.getSelectedIndex();
            verificarQuantidade("bi-implicação", min, max);
            parametros.put("<->", new ParametroEntry(min, max));
        }
    	
    	int min = jComboBoxQuantParentesesMin.getSelectedIndex();
        int max = jComboBoxQuantparentesesMax.getSelectedIndex();
        parametros.put("(", new ParametroEntry(min, max));
		return parametros;
	}
       
        
	private void botaoSalvarActionPerformed(ActionEvent evt) {
	    try {
			
		FormulaList formulaList = new FormulaList();
		formulaList.setFormulas(formulas);
			
		JAXBContext context = JAXBContext.newInstance(FormulaList.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(formulaList, System.out);
			
			
		marshaller.marshal(formulaList, new File("formulas.xml"));
			
		
		} catch (JAXBException e) {
			e.printStackTrace();
		} 
	}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton2;
    private javax.swing.JButton botaoGerar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JComboBox jComboBoxMInR;
    private javax.swing.JComboBox jComboBoxMaxBI;
    private javax.swing.JComboBox jComboBoxMaxCon;
    private javax.swing.JComboBox jComboBoxMaxDis;
    private javax.swing.JComboBox jComboBoxMaxImp;
    private javax.swing.JComboBox jComboBoxMaxNeg;
    private javax.swing.JComboBox jComboBoxMaxP;
    private javax.swing.JComboBox jComboBoxMaxQ;
    private javax.swing.JComboBox jComboBoxMaxR;
    private javax.swing.JComboBox jComboBoxMaxT;
    private javax.swing.JComboBox jComboBoxMinBi;
    private javax.swing.JComboBox jComboBoxMinCon;
    private javax.swing.JComboBox jComboBoxMinDis;
    private javax.swing.JComboBox jComboBoxMinImp;
    private javax.swing.JComboBox jComboBoxMinNeg;
    private javax.swing.JComboBox jComboBoxMinP;
    private javax.swing.JComboBox jComboBoxMinQ;
    private javax.swing.JComboBox jComboBoxMinT;
    private javax.swing.JComboBox jComboBoxQuantParentesesMin;
    private javax.swing.JComboBox jComboBoxQuantparentesesMax;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBi;
    private javax.swing.JRadioButton jRadioButtonCon;
    private javax.swing.JRadioButton jRadioButtonDis;
    private javax.swing.JRadioButton jRadioButtonImp;
    private javax.swing.JRadioButton jRadioButtonNeg;
    private javax.swing.JRadioButton jRadioButtonP;
    private javax.swing.JRadioButton jRadioButtonQ;
    private javax.swing.JRadioButton jRadioButtonR;
    private javax.swing.JRadioButton jRadioButtonT;
    // End of variables declaration//GEN-END:variables
}
