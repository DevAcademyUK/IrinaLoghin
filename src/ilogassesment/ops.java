package ilogassesment;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;


public class ops {
    double cAccountBalance = 100.23, jAccountBalance=32.25, sAccountBalance = 60.00, transferAmount;
    short depositAmount;

    Scanner myScanner = new Scanner(System.in);
    logIn newUser;

    // transferMoney(): void
    //withdrawMoney(): void
    //checkBalance(): void
    //makeDeposit(): void


    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Please type your username:\n");

        String userName =myScanner.nextLine();
        System.out.println("Please type your password:\n");

        String pw = myScanner.nextLine();
        logIn newUser = new logIn(userName,pw);
        newUser.verify(userName,pw);
        if(newUser.verify(userName,pw)==FALSE)
        {
            System.out.println("Wrong username or password, please try again. ");
            main (new String[] {});
        }


        ops newOperation = new ops();
        newOperation.newUser = newUser;
        newOperation.pickOperation();



    }


    public void pickOperation() {
        if (newUser.verify(newUser.userName, newUser.pw)) {
            System.out.println("Please choose an action: \n" +
                    "1. Transfer money \n" +
                    "2. Withdraw money \n" +
                    "3. Check balance \n" +
                    "4. Make a deposit \n" +
                    "5. Log out \n");
            int op = Integer.parseInt(myScanner.nextLine());
            switch (op) {
                case 1:
                    transferMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    makeDeposit(depositAmount);
                    break;
                case 5:
                    logOut();
                    break;
                default:
                    System.out.println("Incorrect input received");
                    System.out.println("Please enter any of the following:");
                    System.out.println("Balance - Check Account Balance");
                    System.out.println("Deposit - Make a deposit to an Account");
                    System.out.println("Withdraw - Make a cash withdrawal");
                    System.out.println("Transfer - Make a transfer between accounts");
                    System.out.println("Logout - sign out of your account");

            }

        }

    }
        public void transferMoney(){
            System.out.println("Which account would you like to transfer from?");
            String source = myScanner.nextLine();
            System.out.println("Which account would you like to transfer to?");
            String destination = myScanner.nextLine();
            System.out.println("How much would you like to transfer?");
            transferAmount= Double.parseDouble(myScanner.nextLine());

            if (source.equalsIgnoreCase("Current"))
            {
                if (cAccountBalance >= transferAmount) {
                    if (destination.equalsIgnoreCase("Joint"))
                    {
                        jAccountBalance += transferAmount;
                        cAccountBalance -= transferAmount;
                    } else if (destination.equalsIgnoreCase("Savings"))
                    {
                        sAccountBalance += transferAmount;
                        cAccountBalance -= transferAmount;
                    } else
                        System.out.println("Invalid destination account");

                }
            } else if (source.equalsIgnoreCase("Joint"))
            {
                if (jAccountBalance >= transferAmount) {
                    if (destination.equalsIgnoreCase("Current"))
                    {
                        cAccountBalance += transferAmount;
                        jAccountBalance -= transferAmount;
                    } else if (destination.equalsIgnoreCase("Savings"))
                    {
                        sAccountBalance += transferAmount;
                        jAccountBalance -= transferAmount;
                    } else
                        System.out.println("Invalid destination account");

                }
            } else if (source.equalsIgnoreCase("Savings"))
            {
                if (sAccountBalance >= transferAmount)

                    if (destination.equalsIgnoreCase("Current"))
                    {
                        cAccountBalance += transferAmount;
                        sAccountBalance -= transferAmount;
                    } else if (destination.equalsIgnoreCase("Joint"))
                    {
                        jAccountBalance += transferAmount;
                        sAccountBalance -= transferAmount;
                    } else
                        System.out.println("Invalid destination account");


            } else
                System.out.println("Invalid source account");

        }



    private void withdrawMoney() {
        System.out.println("Which account would you like to make a withdrawal from?");
        String account = myScanner.nextLine();
        System.out.println("how much would you like to withdraw?");
        short withdrawAmount = Short.parseShort(myScanner.nextLine());

        if(account.equalsIgnoreCase("Current")){
            if(withdrawAmount <= cAccountBalance){
                cAccountBalance -= withdrawAmount;
            }
            else
                System.out.println("Insufficient Funds");
        }
        else if(account.equalsIgnoreCase("Joint")){
            if(withdrawAmount <= jAccountBalance){
                jAccountBalance -= withdrawAmount;
            }
            else
                System.out.println("Insufficient Funds");
        }
        else if(account.equalsIgnoreCase("Savings")){
            if(withdrawAmount <= sAccountBalance){
                sAccountBalance -= withdrawAmount;
            }
            else
                System.out.println("Insufficient Funds");
        }
        else {
            System.out.println("Invalid account option provided");
        }

    }

        private void checkBalance(){
            System.out.println("Which account would you like to check the balance of?");
            String account = myScanner.nextLine();
            if(account.equalsIgnoreCase("Current")){
                System.out.println("Your current account balance is: " + cAccountBalance);
            }
            else if(account.equalsIgnoreCase("Joint")){
                System.out.println("Your current account balance is: " + jAccountBalance);
            }
            else if(account.equalsIgnoreCase("Savings")){
                System.out.println("Your current account balance is: " + sAccountBalance);
            }
            else {
                System.out.println("Invalid account option provided");
            }


}


    private void makeDeposit(short depositAmount) {
        System.out.println("Which account would you like to make a deposit to?");
        String account = myScanner.nextLine();
        System.out.println("how much would you like to deposit?");
        depositAmount = Short.parseShort(myScanner.nextLine());

        if(account.equalsIgnoreCase("Current")) {
            cAccountBalance += depositAmount;
        }
        else if(account.equalsIgnoreCase("Joint")) {
            jAccountBalance += depositAmount;
        }
        else if(account.equalsIgnoreCase("Savings")) {
            sAccountBalance += depositAmount;
        }
        else {
            System.out.println("Invalid account option provided");
        }
    }


    public void logOut() {

        System.out.println("Are you sure you want to exit? Submit your answer: yes \\ no \n ");
        String logout = myScanner.nextLine();

        if (logout.equalsIgnoreCase("yes")) {
            {
            System.out.println("\nYou have been logged out successfully. Would you like to log in again?  \n yes \\ no \n");

                if(myScanner.nextLine().equalsIgnoreCase("yes"))
                    main (new String[] {});
                else System.out.println("Bye-bye! see you soon!");
            }


        } else
            if (logout.equalsIgnoreCase("no")) {
            System.out.println("\nYou have NOT been logged out yet.");
            pickOperation();
        }
            else {
                System.out.println("Please make a choice between YES or NO");
                   logOut(); }


    }


}
