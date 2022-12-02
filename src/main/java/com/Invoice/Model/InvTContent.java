package com.Invoice.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvTContent extends AbstractTableModel {
    
    private ArrayList<InvContent> invss;
    private String[] invTCols = {"No.","Date","Customer Name","Total"};
    public InvTContent(ArrayList<InvContent> invss) {
        this.invss = invss;
    }
    
    

    
    public int getRowCount() {
        return invss.size(); }
       
    public String getColumnName(int invTCol){
    
        return invTCols[invTCol]; }
    
    public int getColumnCount() {
        return invTCols.length;}

    public Object getValueAt(int rI, int cI) {
     
        InvContent invC = invss.get(rI);
        
  
       if (cI == 0){return invC.getInvnum();}
            else if(cI== 1){return invC.getInvdate();}
            else if(cI== 2){return invC.getCustname();}
            else if(cI== 3){return invC.getInvT();}
            else{return "";}
            
        

    }
    
}
