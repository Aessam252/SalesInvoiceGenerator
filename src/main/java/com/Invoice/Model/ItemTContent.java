package com.Invoice.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ItemTContent extends AbstractTableModel {
    
    private ArrayList<InvItems> items;
    private String[] invTCols = {"No.","Item Name","Item Price","Count","Item Total"};

   
 public ItemTContent(ArrayList<InvItems> x) {items = x;}
        
        
    public int getRowCount() { return items.size();}
       

    public String getColumnName(int invTCol){ return invTCols[invTCol];}
       

    public int getColumnCount() { return invTCols.length;}
       
    
     public ArrayList<InvItems> getItems() {
        return items;}
     
    public Object getValueAt(int y, int z) {
        InvItems item = items.get(y);
        
       if (z == 0){return item.getCont().getInvnum();}
            else if(z== 1){return item.getGoods();}
            
            else if(z== 2){return item.getValue();}
            
            else if(z== 3){return item.getNumOfItems();}
            
            else if(z== 4){return item.getItT();}
            
            else{return "";}

    }
    
}
