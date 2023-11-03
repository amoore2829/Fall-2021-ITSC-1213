public class BankAccount {
    private double balance;
    private int ID;
    
  
    public BankAccount(int id, double initialBalance) {
        this.balance = initialBalance;
        this.ID = id;    
    }
    
    public int getID() {
        return ID;    
    }
    
    public void setBalance(double Balance) {   
        this.balance = Balance;
    }
    
    public double getBalance() {      
        return balance;
    }
    
    @Override
    public String toString() {      
        return "Account ID: " + ID + " " + "Balance: " + balance;
        
    }
}
