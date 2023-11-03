
public class ATM {
    private BankAccount account;
    
    public ATM(BankAccount b) {
        
      account = b;
       
    }
    
    public void withdraw(double amount) {
        
        if(amount > 0 && amount <= account.getBalance()) {
            
            account.setBalance((account.getBalance() - amount));
            System.out.println("Withdraw successful, New Balance is: " + account.getBalance());
        }else 
            System.out.println("Withdraw cancelled, amount must be greater than 0 and less the account balance: " + account.getBalance());
           
            
          
    }
    
    public void deposit(double Amount) {
        
        if(Amount > 0 ) {       
            account.setBalance(Amount + account.getBalance());
            System.out.println("Deposit successful, New Balance is: " + account.getBalance());
             
        }else {
            System.out.println("Deposit cancelled, amount must be grater than 0");
        }
    }
 
    public double getBalance() {
          
        return account.getBalance();
        
    }
    
      
      
      public void setAccount(BankAccount b) {
          if(b== null) {
              System.out.println("The BankAccount object cannot be null");
          }else {
              account = b;
                
          }
          
      }
      
      public String getAccountInformation() {
          return "Account ID: " + account.getID() + " Account balance: " + account.getBalance();
      }
      
      
     
    
}

