package com.Invoice.View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ItemDialog extends JDialog{
    private JTextField iNF;
    private JTextField iCF;
    private JTextField pF;
    private JLabel nLIT;
    private JLabel lLIT;
    private JLabel cL;
    private JButton keda;
    private JButton shut;
    
    public ItemDialog(InvFrame f) {
        iNF = new JTextField(20);
        nLIT = new JLabel("Item Name");
        iCF = new JTextField(20);
        lLIT = new JLabel("Item Count");
        pF = new JTextField(20);
        cL = new JLabel("Item Price");
        keda = new JButton("OK");
        shut = new JButton("Cancel");
        keda.setActionCommand("itConfirm");
        shut.setActionCommand("ItemC");
        keda.addActionListener(f.getAction());
        shut.addActionListener(f.getAction());
        setLayout(new GridLayout(4, 2));
        
        add(nLIT);
        add(iNF);
        add(lLIT);
        add(iCF);
        add(cL);
        add(pF);
        add(keda);
        add(shut);
        pack();}

    public JTextField getiNF() {
        return iNF; }

    public JTextField getiCF() {
        return iCF;}

    public JTextField getpF() {
        return pF;}
    
  }

