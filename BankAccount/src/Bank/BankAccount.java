/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer
 */
public class BankAccount {
    
    private String owner;
    private double sum;
    
    private static List<BankAccount> b = new ArrayList<BankAccount>();
    private static List<String> th = new ArrayList<String>();
    
    public String getOwner(){
        return this.owner;
    } 
    
    public double getSum(){
        return this.sum;
    }

    public BankAccount() {
        this("Mr.Cartholder",0);
    }
    public BankAccount(String owner) {
        this(owner,0);
    }
    public BankAccount(double sum) {
        this("Mr.Cartholder",sum);
    }

    public BankAccount(String owner, double sum) {
        this.owner = owner;
        this.sum = sum;

        b.add(this);
    }
    
    public void deposit(double summa){
        this.sum += summa;
    }
    
    public boolean withdraw(double summa){
        boolean result;
        if(summa > this.sum){
            System.out.println("You can not draw this sum! Operation canceled!");
            result = false;
        }else{
            this.sum -= summa;
            result = true;
        }
        return result;
    }
    
    public void getInfo(){
        System.out.println(toString());
    }
    
    public static void getInfoAll(){
        for(BankAccount ba : b){
            System.out.println("**************************");
            ba.getInfo();
        }
    }
    
    public static void transfer(BankAccount sourceAccount, BankAccount recipientAccount, double summa){
       String res; 
       if (sourceAccount.withdraw(summa) == true){
          recipientAccount.deposit(summa);
          res = "succes";
       }else{
          res = "error";
       }
       
       th.add(String.format("From %s to %s sum = %.2f result = %s\n",sourceAccount.owner,recipientAccount.owner, summa, res));
    }
    
    public static void getTransactionInfo(){
        for(String s : th){
            System.out.println(s);
        }
    }
    
    

    @Override
    public String toString() {
        return String.format("Account = %s; summa = %.2f $;",this.owner, this.sum);
    }
    
    
    
    
    
}
