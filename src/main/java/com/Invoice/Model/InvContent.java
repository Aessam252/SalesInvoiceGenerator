package com.Invoice.Model;

import java.util.ArrayList;


public class InvContent {
    
   
    private int invnum;
    private String invdate;
    private String custname;
    private double invT;
    private ArrayList<InvItems> items;

    
    public double getInvT(){
       double all=0.0;
       for (InvItems items : getItems()){
          all =all+items.getItT();
      }
       return all; 
    }
    
    public ArrayList<InvItems> getItems() {
        
        if(items == null){
        items = new ArrayList<>();
        }
        return items;
    }

    public InvContent() {
    }


    public InvContent(int invnum, String Date, String custname) {
        this.invnum = invnum;
        this.invdate = Date;
        this.custname = custname;
    }

    public int getInvnum() {
        return invnum;
    }

    public void setInvnum(int invnum) {
        this.invnum = invnum;
    }

    public String getInvdate() {
        return invdate;
    }

    public void setInvdate(String invdate) {
        this.invdate = invdate;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

   
    public String toString() {
        return "InvoiceContents are{" + "Invoice Number=" + invnum + ", Invoice Date=" + invdate + ", Customer Name=" + custname + '}';
    }

    public String separated() {
                      String z=invnum+","+invdate+","+custname;
                      return z;    
                     }

   
}
