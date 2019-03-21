package ilogassesment;

import java.util.Scanner;



public class ops extends logIn{
    double cAccountBalance=100.23, jAccountBalance, sAccountBalance=0,transferAmount ;
    short depositAmount, withdrawAmount;
    String logout;
    Scanner myScanner=new Scanner(System.in);
    logIn newUser=new logIn();

    // transferMoney(double transferAmount, String userName): double
    //withdrawMoney(double withdrawAmount): boolean
    //checkBalance(string userName): double
    //makeDeposit(double depositAmount): boolean



    public static void main(String[] args) {
        logIn newUser=new logIn();
        ops newOperation=new ops();
        Scanner myScanner=new Scanner(System.in);

        if(newUser.verify(newUser.userName, newUser.pw)){
          System.out.println("Please choose an action: \n" +
                  "1. Transfer money \n" +
                  "2. Withdraw money \n" +
                  "3. Check balance \n" +
                  "4. Make a deposit \n");
        int i=myScanner.nextInt();
        switch (i){
            case 1:

        }


      }
    }



    public void transferMoney(){

        System.out.println("Which account would you like to transfer from?");
        String source = myScanner.nextLine();
        System.out.println("Which account would you like to transfer to?");
        String destination = myScanner.nextLine();
        System.out.println("How much would you like to transfer?");
        double amount = Double.parseDouble(myScanner.nextLine());

        if(source.equalsIgnoreCase("Current")){
            if(cAccountBalance >= amount){
                if(destination.equalsIgnoreCase("Joint")){
                    jAccountBalance += amount;
                    cAccountBalance -= amount;
                }
                else if(destination.equalsIgnoreCase("Savings")){
                    sAccountBalance += amount;
                    cAccountBalance -= amount;
                }
                else {
                    System.out.println("Invalid destination account");
                }
            }
        }
        else if(source.equalsIgnoreCase("Joint")){
            if(jAccountBalance >= amount){
                if(destination.equalsIgnoreCase("Current")){
                    cAccountBalance += amount;
                    jAccountBalance -= amount;
                }
                else if(destination.equalsIgnoreCase("Savings")){
                    sAccountBalance += amount;
                    jAccountBalance -= amount;
                }
                else {
                    System.out.println("Invalid destination account");
                }
            }
        }
        else if(source.equalsIgnoreCase("Savings")){
            if(sAccountBalance >= amount){
                if(destination.equalsIgnoreCase("Current")){
                    cAccountBalance += amount;
                    sAccountBalance -= amount;
                }
                else if(destination.equalsIgnoreCase("Joint")){
                    jAccountBalance += amount;
                    sAccountBalance -= amount;
                }
                else {
                    System.out.println("Invalid destination account");
                }
            }
        }
        else {
            System.out.println("Invalid source account");
        }


    }
    }



    public void logOut(){

        System.out.println("Aare you sure you want to exit? Submit your answer: yes \\ no \n ");
        String logout=myScanner.nextLine();

        if(logout.equalsIgnoreCase("yes")){

            System.out.println("\nYou have been logged out succesfully. Bye-Bye!");


        }
        else if (logout.equalsIgnoreCase("no")){
            System.out.println("\nYou have NOT been logged out yet.");

        }


    }



}
