package com.Invoice.Controller;

import com.Invoice.Model.InvTContent;
import com.Invoice.Model.InvContent;
import com.Invoice.Model.InvItems;
import com.Invoice.Model.ItemTContent;
import com.Invoice.View.InvDialog;
import com.Invoice.View.InvFrame;
import com.Invoice.View.ItemDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Actions implements ActionListener, ListSelectionListener{
   
    private InvDialog iD;
    private ItemDialog itD;
    private InvFrame f;
    public Actions(InvFrame m){ 
        f=m; }

  
    public void actionPerformed(ActionEvent ac) {
         
        String cMD=ac.getActionCommand();
        System.out.println("Action"+cMD);
        
        if(cMD=="Save Invoice"){
            
          sF();
          
        }else if(cMD=="Load Invoice"){
          lF();
        
        }else if(cMD=="Create Invoice"){
         
          createINV();
          
        }else if(cMD=="Delete Invoice"){
          
          delINV();
          
        }else if(cMD=="Create Item"){
        
          creatI();  
            
        }else if(cMD=="Remove Item"){
        
          delI();
        
        }else if(cMD=="Close Inv"){
          iClose();
          
        }else if(cMD=="Confirm"){
          iO();
          
        }else if(cMD=="itConfirm"){
          lO();
          
        }else if(cMD=="ItemC"){
          iTCa();
          
        }
   
    }

     @Override
    public void valueChanged(ListSelectionEvent l) {
         int si = f.getIT().getSelectedRow();
         
         if (si != -1){
         InvContent ic = f.getInvss().get(si);
         f.getINL().setText(""+ic.getInvnum());
         f.getIDL().setText(ic.getInvdate());
         f.getNL().setText(ic.getCustname());
         f.getITL().setText(""+ic.getInvT());
         
         ItemTContent i=new ItemTContent(ic.getItems());
         f.getITT().setModel(i);
         i.fireTableDataChanged();}
    }
    
    private void sF() {
        
        ArrayList <InvContent> v=f.getInvss();
        String h="";
        String items="";
        for(InvContent o: v){
          String CommonSeperatedValues= o.separated();
          h=h+CommonSeperatedValues;
          h=h+"\n";
          
          for(InvItems item :o.getItems()){
          
          String itemCommon=item.separated();
           items =items+itemCommon;
           items = items+"\n";
          }
        }
        
       try{JFileChooser fileChooser=new JFileChooser();
      int save= fileChooser.showSaveDialog(f);
      if(save==JFileChooser.APPROVE_OPTION){
          File fH=fileChooser.getSelectedFile();
          FileWriter x=new FileWriter(fH);
          x.write(h);
          x.flush();
          x.close();
          save = fileChooser.showSaveDialog(f);
          
        if(save==JFileChooser.APPROVE_OPTION){
          File fi=fileChooser.getSelectedFile();
           FileWriter y=new FileWriter(fi);
          y.write(items);
          y.flush();
          y.close();
        }  
      }
     }catch(IOException c){}
    }

    private void lF() {
      JFileChooser fileChooser =new JFileChooser();
      
      try {
      int openF = fileChooser.showOpenDialog(f);
      if(openF == JFileChooser.APPROVE_OPTION){
 
      File invFile = fileChooser.getSelectedFile();
      Path invoice = Paths.get(invFile.getAbsolutePath());
      List<String> invItems = Files.readAllLines(invoice);
        ArrayList<InvContent> invArr= new ArrayList<>();
        for (String invItem : invItems) {
             try{
             String[] invComponents = invItem.split(",");
             int invNumber = Integer.parseInt(invComponents[0]);
             String invD = invComponents[1];
             String buyerN = invComponents[2];

         InvContent invC = new InvContent(invNumber, invD, buyerN);
         invArr.add(invC);}catch(Exception k){
            JOptionPane.showMessageDialog(f,
                    "Error in Item Format",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
         }    
        }
        
          
          
          openF = fileChooser.showOpenDialog(f);
                if(openF == JFileChooser.APPROVE_OPTION){
                   File itemFile = fileChooser.getSelectedFile();
                   Path items = Paths.get(itemFile.getAbsolutePath());
                   List<String> itemItems = Files.readAllLines(items);
                  for (String itemItem : itemItems) {
                     
                     try{String[] itemComponents = itemItem.split(",");
                    int invNumber = Integer.parseInt( itemComponents[0]);
                    String itN = itemComponents[1];
                    double itP = Double.parseDouble(itemComponents[2]);
                    int c =Integer.parseInt(itemComponents[3]);
                    InvContent i = null;
                    for(InvContent invC :invArr){
                    
                      if(invC.getInvnum() == invNumber){
                       
                          i = invC;
                        break;
                      }  
                    }
                  InvItems item =new InvItems(itN,itP,c,i);
                  i.getItems().add(item);
                     }catch(Exception k){
            JOptionPane.showMessageDialog(f,
                    "Error in Item Format",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                     }    
                  }
                    
                }
             f.setInvss(invArr);
             InvTContent invTCon = new InvTContent(invArr);
             f.setInvTCon(invTCon);
             f.getIT().setModel(invTCon);
             f.getInvTCon().fireTableDataChanged();
      
      
      }      
        
      }catch (Exception exeption){exeption.printStackTrace();
                       JOptionPane.showMessageDialog(f, 
                               "Error in File Reading", 
                               "Error", 
                               JOptionPane.ERROR_MESSAGE);
                    } 
    }

    private void createINV() {
        
        iD=new InvDialog(f);
        iD.setVisible(true);}
    
    private void delINV() {
        
     int r =   f.getIT().getSelectedRow();
     if(r != -1){
        f.getInvss().remove(r);
        f.getInvTCon().fireTableDataChanged();}
    }

    private void creatI() {
        
        itD=new ItemDialog(f);
        itD.setVisible(true);}

    private void delI() {
        int r =   f.getITT().getSelectedRow();
        if(r != -1){
        
        ItemTContent itC=(ItemTContent) f.getITT().getModel();
        itC.getItems().remove(r);
        itC.fireTableDataChanged();
        f.getInvTCon().fireTableDataChanged();
        
         }

    }

    private void iClose() {
        iD.setVisible(false);
        iD.dispose();
        iD=null;
    }

    private void iO() {DateFormat y=new SimpleDateFormat("dd-mm-yyyy");
       int x=f.getIN();
        String c=iD.getCustNameField().getText();
        String t = iD.getInvDateField().getText();
        try{
            String[] p = t.split("-");
            if (p.length < 3) {
             JOptionPane.showMessageDialog(f,
                                           "Please Enter a Right Date Format", 
                                           "Error", 
                                           JOptionPane.ERROR_MESSAGE);
            } else {
             int a = Integer.parseInt(p[0]);
             int b = Integer.parseInt(p[1]);
             int e = Integer.parseInt(p[2]);
            boolean m=(a > 31 || b > 12);
             if (m==true) {
                 JOptionPane.showMessageDialog(f, 
                     "Please Enter a Right Date Format", 
                     "Error",
                     JOptionPane.ERROR_MESSAGE);
                }else{  
             InvContent i=new InvContent(x,t,c);
             f.getInvss().add(i);
             f.getInvTCon().fireTableDataChanged();
             iD.setVisible(false);
             iD.dispose();
             iD=null;}
            }
        }catch(Exception n){
          JOptionPane.showMessageDialog(f,
                                        "Please Enter a Right Date Format",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
         }
        
       
    }

    private void lO() {
        String lo=itD.getiNF().getText();
        String n=itD.getiCF().getText();
        int c=Integer.parseInt(n);
        String cost=itD.getpF().getText();
        double p=Double.parseDouble(cost);
        int s=f.getIT().getSelectedRow();
        if (s!=-1){
        InvContent v=f.getInvss().get(s);
        InvItems t=new InvItems(lo,p,c,v);
        v.getItems().add(t);
        ItemTContent item=(ItemTContent) f.getITT().getModel();
        //item.getItems().add(t);
        item.fireTableDataChanged();
        f.getInvTCon().fireTableDataChanged();
        }
        itD.setVisible(false);
        itD.dispose();
        itD=null;
    }

    private void iTCa() {
        itD.setVisible(false);
        itD.dispose();
        itD=null;
    }

   
    
}
