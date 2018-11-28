
package Bank;


public class Bank {
    
    public static void main(String[] args){
        
        BankAccount b1 = new BankAccount("Sergey", 1000);
        BankAccount b2 = new BankAccount("Yana", 10);
        BankAccount.getInfoAll();
//       b1.getInfo();
//       b2.getInfo();
       
       BankAccount.transfer(b1, b2, 500);
       BankAccount.getInfoAll();
//       b1.getInfo();
//       b2.getInfo();
       
       BankAccount.transfer(b1, b2, 500);
       BankAccount.getInfoAll();
//         b1.getInfo();
//       b2.getInfo();
       
        BankAccount.transfer(b1, b2, 500);
         b1.getInfo();
       b2.getInfo();
       
        BankAccount b3 = new BankAccount(5000);
     
        
        BankAccount.transfer(b3, b1, 4000);
        
        BankAccount.getInfoAll();
        
        BankAccount.getTransactionInfo();
        
     
        
    }
    //01:03:47
    
}
