package com.Invoice.Model;


public class InvItems {
    
    
    private String goods;
    private double value;
    private int numOfItems;
    private InvContent cont;

    public InvItems() {
    }

    public InvItems(String x, double y, int z,InvContent a ) {
        cont = a;
        goods = x;
        value = y;
        numOfItems = z;
    }

  public double getItT(){
        
        double t=value * numOfItems;
        return t;
    }
    

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int n) {
           numOfItems = n;
    }

   
    public String getGoods() {
        return goods;
    }

    public void setGoods(String x) {
           goods = x;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double y) {
         value = y;
    }

    @Override
    public String toString() {
        return "InvoiceItems{" + "Invoice Number=" + cont.getInvnum() + 
                ", Item=" + goods + ",Item Price=" + value + 
                ", Number of items=" + numOfItems + '}';
    }

    public InvContent getCont() {
        return cont;
    }
    
    
     public String separated(){
      String y=cont.getInvnum()+","+goods+","+value+","+numOfItems;
      return y;
    }
    
}
