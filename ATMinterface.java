import java.util.Scanner;

public class ATMinterface {

    private double balance;
    
    public ATMinterface(){
        
        balance=1000.0;

    }
    public void displayMenu(){

        System.out.println("ATM Menu : ");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void checkBalance(){

        System.out.println("Your balance is : $" +balance);
    }

    public void deposit(double amount ){

        if(amount>0){

            balance+=amount;

            System.out.println("$"+ amount+" Has been deposited.");
            
        }
        else{

            System.out.println("Invalid amount . Please deposit a positive amount ");
        }
    }

    public void withdraw(double amount){

        if(amount>0 && amount<=balance){

            balance-=amount;

            System.out.println("$"+amount+"Has been withdraw from your account .");
        }
        else{
            System.out.println("Invalid withdraw amount  or insufficient funds . ");
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ATMinterface atm=new ATMinterface();
        System.out.println();
        System.out.println(" Welcome to the ATM !  ");
        System.out.println();

        while(true){

            atm.displayMenu();
            System.out.println("Enter your choice (1/2/3/4) :  ");
            int choice=sc.nextInt();

            switch(choice){

                case 1:
                      atm.checkBalance();
                      System.out.println();
                      break;
                case 2:
                      System.out.println("Enter the amount to deposit : $");
                      double depositAmount=sc.nextDouble();
                      atm.deposit(depositAmount);
                      break;
                case 3:
                     System.out.print("Enter the amount to withdraw: $");
                     double withdrawAmount = sc.nextDouble();
                     atm.withdraw(withdrawAmount);
                     break;
                case 4:
                     System.out.println("Thank you for using the ATM. Goodbye!");
                     sc.close();
                     System.exit(0);
                default:
                     System.out.println("Invalid choice. Please select a valid option (1/2/3/4).");
                
            }
        }
        
    }

}




