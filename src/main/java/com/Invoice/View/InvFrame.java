package com.Invoice.View;

import com.Invoice.Controller.Actions;
import com.Invoice.Model.InvTContent;
import com.Invoice.Model.InvContent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class InvFrame extends JFrame {

    public InvFrame() {
        initComponents();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        iT = new javax.swing.JTable();
        iT.getSelectionModel().addListSelectionListener(action);
        cNI = new javax.swing.JButton();
        cNI.addActionListener(action);
        rINV = new javax.swing.JButton();
        rINV.addActionListener(action);
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        iNL = new javax.swing.JLabel();
        iDL = new javax.swing.JLabel();
        nL = new javax.swing.JLabel();
        iTL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        iTT = new javax.swing.JTable();
        cIBT = new javax.swing.JButton();
        cIBT.addActionListener(action);
        rItBT = new javax.swing.JButton();
        rItBT.addActionListener(action);
        jMenuBar1 = new javax.swing.JMenuBar();
        fileM = new javax.swing.JMenu();
        li = new javax.swing.JMenuItem();
        si = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        iT.setGridColor(new java.awt.Color(51, 51, 51));
        iT.setShowGrid(true);
        jScrollPane1.setViewportView(iT);

        cNI.setText("Create Invoice");
        cNI.setToolTipText("");
        cNI.setActionCommand("Create Invoice");
        cNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNIActionPerformed(evt);
            }
        });

        rINV.setText("Delete Invoice");

        l1.setText("Invoice Number");

        l2.setText("Date");

        l3.setText("Customer Name");

        l4.setText("Invoice total");

        iTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        iTT.setGridColor(new java.awt.Color(51, 51, 51));
        iTT.setShowGrid(true);
        jScrollPane2.setViewportView(iTT);

        cIBT.setText("Create Item");

        rItBT.setText("Remove Item");

        fileM.setText("File");

        li.setText("Load Invoice");
        fileM.add(li);
        li.addActionListener(action);

        si.setText("Save Invoice");
        fileM.add(si);
        si.addActionListener(action);

        jMenuBar1.add(fileM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rINV)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cIBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rItBT)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l3)
                                    .addComponent(l4)
                                    .addComponent(l2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(iDL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(nL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(iTL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iNL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l1)
                            .addComponent(iNL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2)
                            .addComponent(iDL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iTL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rINV)
                    .addComponent(cNI)
                    .addComponent(cIBT)
                    .addComponent(rItBT))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNIActionPerformed

    }//GEN-LAST:event_cNIActionPerformed
     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new InvFrame().setVisible(true);}   
        });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cIBT;
    private javax.swing.JButton cNI;
    private javax.swing.JMenu fileM;
    private javax.swing.JLabel iDL;
    private javax.swing.JLabel iNL;
    private javax.swing.JTable iT;
    private javax.swing.JLabel iTL;
    private javax.swing.JTable iTT;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JMenuItem li;
    private javax.swing.JLabel nL;
    private javax.swing.JButton rINV;
    private javax.swing.JButton rItBT;
    private javax.swing.JMenuItem si;
    // End of variables declaration//GEN-END:variables
    private ArrayList<InvContent> invss;
    private Actions action = new Actions(this);
    private InvTContent invTCon;

    public JLabel getIDL() { return iDL;}

    public JLabel getINL() {return iNL;}

    public JTable getIT() {return iT;}

    public JLabel getITL() { return iTL;}

    public JTable getITT() {return iTT;}

    public JLabel getNL() { return nL;  }

    public Actions getAction() { return action;}
    
    public InvTContent getInvTCon() { return invTCon;}
    
    public void setInvTCon(InvTContent invTCon) {this.invTCon = invTCon;}
    
    public int getIN(){
    int x=0;
    for(InvContent i :getInvss()){
    if(i.getInvnum()>x){
      x=i.getInvnum();}
    }
    return ++x; }
   
    public ArrayList<InvContent> getInvss() {return invss;}
        
    public void setInvss(ArrayList<InvContent> invss) { this.invss = invss;}
       
 }
