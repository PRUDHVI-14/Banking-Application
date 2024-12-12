package Banking_Project_java;

import java.util.*;
//Application Class-not user interactive
public class BankingApplication  {
    
    Scanner sc = new Scanner(System.in);
    
    //varibles for individual account balance
    private double user1Balc = 10000, loan1Balc = 0;
    private double user2Balc = 10001, loan2Balc = 0;
    private double user3Balc = 1000 , loan3Balc = 0;
    private double user4Balc = 1000 , loan4Balc = 0;

    //to display the welcome message...
    public void greetings(){
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.println("  Welcome to 'ABC' bank ");
        System.out.println();
    }

    int accNo;
    //Account detalis..
    public  void credentials(){
        System.out.print("  Enter the Banking credentials-Account no 630050" );
        accNo = sc.nextInt();
        System.out.print("  Enter yout four-digit security pin: " );
        int pin = sc.nextInt();
        int count =0;
        if(accNo == 101 && pin == 1111){
         userRequirement(accNo);
        }
        else if(accNo == 102 && pin == 2222){
            userRequirement(accNo);
        }
        else if(accNo == 103 && pin == 3333){
            userRequirement(accNo);
        }
        else if(accNo == 104  && pin == 4444){
            userRequirement(accNo);
        }
        else{
            System.out.printf("  \n  oops!! Incorrect AccNo- %d or pin- %d",accNo,pin);
            System.out.println();
            count+=1;
            if(count<=5){
                credentials();
            }else{
                System.out.println("sorry! so many attempts");
            }
        }
    }
      
    //method for user's choice...
    public  void userRequirement(int accNo){
        int choice;
        do{
            System.out.println();
            System.out.println();
            System.out.println("  How can we help you ");
            System.out.println("  1: Bank loan");
            System.out.println("  2: Current Balance "); 
            System.out.println("  3: With Draw ");
            System.err.println("  4: Deposit");
            System.out.println("  5: Exit"); 
                
            choice = sc.nextInt();
            switch (choice) {
                case 1: bankLoan();
                        break;
                case 2: currentBalance();
                        break;
                case 3: withDraw();
                        break;
                case 4: deposit();
                        break;
                case 5: System.out.println(" Thank you for visiting 'ABC' bank");     
                        break;   
                default: System.out.println("Enter the valid option:");
                    break;
            }
        }while(choice != 5);
            
        
    }
    
    //Method for choice -1 : Bank loan
    public  void bankLoan(){
        System.out.println();
        
        System.out.println("  Do you want to check your  1:  loan balance  2: want loan ");
        int response = sc.nextInt();
        if(response ==1){
            loanBalance();
        }    
        else if(response ==2){
            System.out.print("\n  Enter your name : ");
            String name = sc.next();
            System.out.print("  \n  Are you a working profession:  1: YES  2: NO  : ");
            int work = sc.nextInt();
            System.out.print("  \n  Enter your monthly salary: ");
            double salary = sc.nextFloat();
            if( work == 1 && salary >= 30000){

                switch(accNo){
                    case 101:   if(loan1Balc <= 0){
                                    System.err.printf("  \n  congrats %s !! -You are elegible for bank loan ",name);
                                    System.out.println();
                                    System.out.print("  \n  Enter the amount you want as a loan: ");
                                    double loan1 = sc.nextDouble();
                                    loan1Balc += loan1;
                                }
                                else{
                                    System.out.printf("  \n  Sorry %s , you are not eligible for loan",name);
                                }
                    break;
                    
                    case 102:   if(loan2Balc <= 0){
                                    System.err.printf("\n  congrats %s !! -You are elegible for bank loan ",name);
                                    System.out.print("  \n  Enter the amount you want as a loan:");
                                    double loan2 = sc.nextDouble();
                                    loan2Balc += loan2;
                                }
                                else{
                                    System.out.printf("  \n  Sorry %s , you are not eligible for loan",name);
                                }
                    break; 
                    
                    case 103:   if(loan3Balc <= 0){
                                    System.err.printf("  \n  congrats %s !! -You are elegible for bank loan",name);
                                    System.out.print("  \n  Enter the amount you want as a loan:");
                                    double loan3 = sc.nextDouble();
                                    loan3Balc += loan3;
                                }
                                else{
                                    System.out.printf("  \n  Sorry %s , you are not eligible for loan",name);
                                }
                    break;

                    case 104:   if(loan4Balc <= 0){
                                    System.err.printf("  \n  congrats %s !! -You are elegible for bank loan",name);
                                    System.out.print("  \n  Enter the amount you want as a loan:");
                                    double loan4 = sc.nextDouble();
                                    loan4Balc += loan4;
                                }
                                else{
                                    System.out.printf("  \n  Sorry %s , you are not eligible for loan",name);
                                }
                    break;
                }
            }
            else{
                System.out.printf("  \n  Sorry %s , you are not eligible for loan",name);
            }
        }
        else{
            System.out.println("  Enter valid option");
            bankLoan();
        }
        System.out.println("  Do you want to check your loan balance 1: YES 2: NO  ");
        int response1 = sc.nextInt();
        if(response1 == 1){
            loanBalance();
        }
        
    }
    
    // Method to check loan banace for all users
    public  void loanBalance(){
        System.out.println();
        switch (accNo) {

            case 101: System.out.printf("  loan balance in your account num 630050%d is %.2f/-",accNo,loan1Balc);
                      break;

            case 102: System.out.printf("  loan balance in your account num 630050%d is %.2f/-",accNo,loan2Balc);        
                      break;

            case 103: System.out.printf("  loan balance in your account num 630050%d is %.2f/-",accNo,loan3Balc);       
                      break;
                      
            case 104: System.out.printf("  loan balance in your account num 630050%d is %.2f/-",accNo,loan4Balc);
                      break; 
        }
    }

    //Method to display savings balance..
    public  void currentBalance(){
        switch (accNo) {

            case 101: System.out.printf("  current balance in your account num 630050%d is %.2f/-",accNo,user1Balc);
                      break;

            case 102: System.out.printf("  current balance in your account num 630050%d is %.2f/-",accNo,user2Balc);        
                      break;

            case 103: System.out.printf("  current balance in your account num 630050%d is %.2f/-",accNo,user3Balc);       
                      break;
                      
            case 104: System.out.printf("  current balance in your account num 630050%d is %.2f/-",accNo,user4Balc);
                      break; 
        }
    }

    //Method to withdraw amount from their individual accounts...
    public  void withDraw(){
        switch (accNo) {
            case 101:   System.out.print("  enter the with draw amount:");
                        double user1Drawn = sc.nextDouble();
                        System.out.println();
                        if(user1Balc <= 1000){
                            System.out.printf("  you have only minimum balnce in your bank account num 630050%d \n",accNo);
                        }
                        else{
                            user1Balc -= user1Drawn;
                        }
                        
            break;

            case 102:   System.out.print("  enter the with draw amount:");
                        double user2Drawn = sc.nextDouble();
                        System.out.println();
                        if(user2Balc <= 1000){
                        System.out.printf("  you have only minimum balnce in your bank account num 630050%d \n",accNo);
                        }
                        else{
                        user2Balc -= user2Drawn;
                        }
                        
            break;

            case 103:   System.out.print("  enter the with draw amount:");
                        double user3Drawn = sc.nextDouble();
                        System.out.println();
                        if(user3Balc <= 1000){
                        System.out.printf("  you have only minimum balnce in your bank account num 630050%d  \n",accNo);
                        }
                        else{
                        user3Balc -= user3Drawn;
                        }
                        
            break;    


            case 104: System.out.print("  enter the with draw amount:");
                        double user4Drawn = sc.nextDouble();
                        System.out.println();
                        if(user1Balc <= 1000){
                            System.out.printf("  you have only minimum balnce in your bank account num 630050%d  \n",accNo);
                        }
                        else{
                            user4Balc -= user4Drawn;
                        }
                        
            break;
        }
        System.out.println();
        System.out.println("  Do you want to check your current balance 1: YES  2: NO");
        int response = sc.nextInt();
        switch (response) {
            case 1: currentBalance();
                    break;
                        
            default: break;
        }
    }
     
    //Method to Deposit amount from their individual accounts...
    public  void deposit(){
        switch (accNo) {
            case 101: System.out.printf("  Enter the amount to deposit to your account num630050%d  \n",accNo);
                      double user1dep = sc.nextDouble();
                      user1Balc += user1dep;
            break;

            case 102: System.out.printf("  Enter the amount to deposit to your account num630050%d \n",accNo);
                      double user2dep = sc.nextDouble();
                      user2Balc += user2dep;
            break;

            case 103: System.out.printf("  Enter the amount to deposit to your account num630050%d  \n",accNo);
                      double user3dep = sc.nextDouble();
                      user3Balc += user3dep;
            break;

            case 104: System.out.printf("  Enter the amount to deposit to your account num630050%d  \n",accNo);
                      double user4dep = sc.nextDouble();
                      user4Balc += user4dep;
            break;
        
        }
        System.out.println("  Do you want to check your current balance 1: YES  2: NO");
        int response = sc.nextInt();
        switch (response) {
            case 1: currentBalance();
                    break;
                        
            default: break;
        }
    }

    //Method to display the current date and time
    static void date(){
        Date date = new Date();
        System.out.println("             "+date);
    }
}

//main class
class BankingSystem{
public static void main(String[] args) {
    //object creation to access another class members..
    BankingApplication bankApp = new BankingApplication();
    bankApp.greetings();
    bankApp.credentials();
    System.out.println();
    BankingApplication.date();
    System.out.println("----------------------------------------------------------------------");
}
}

