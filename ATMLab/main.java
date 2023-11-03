import java.util.Scanner;
public class main {
    
    public static BankAccount bank;
    public static ATM atm;
    
   
    public static void main(String[] args) {
        
        
        printOptions();
        

        
    }
    
    public static void printOptions() {
        
         Scanner keyboard = new Scanner(System.in); 
         
        int choice = 0;
        
        
        System.out.println("1. Get Account Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
        
        System.out.print("Please enter option (1-4): "); 
        choice = keyboard.nextInt();
        
        while(choice < 1 || choice > 4) {
        System.out.print("Selction can only be 1 - 4: ");
        choice = keyboard.nextInt();
        }
      
        handleSelection(choice);
        
        
        
    } 
    
    public static void handleSelection(int choice) {
        
        
        double amountWithdraw = 0.0;
        double amountDeposit = 0.0;
        
        Scanner keyboard = new Scanner(System.in); 
        
        BankAccount bankAcc = new BankAccount(10212, 1021.90);
        ATM atm = new ATM(bankAcc);
       

        
        
        
      
        if(choice == 1) 
        {  
            System.out.println(atm.getBalance());
            
        } if(choice == 2) 
        { 
            System.out.println("How much would like to withdraw?: ");
            amountWithdraw = keyboard.nextDouble();
            atm.withdraw(amountWithdraw);
            
        } if (choice == 3) 
        {
            System.out.println("How much would like to deposit?: ");
            amountDeposit = keyboard.nextDouble();
            atm.deposit(amountDeposit);
             
        } if (choice == 4)
        {
            System.out.close();
            
        } else 
        {
            printOptions();
        }

        }
        
       
    }

