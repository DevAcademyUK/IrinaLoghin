package ilogassesment;

//import java.io.*;
import java.util.Scanner;
import static java.lang.Boolean.*;

public class logIn {

    String userName;
    String pw;
    Scanner myScanner = new Scanner(System.in);
 //   java.io.Console console = System.console();

//    public static void main(String[] args) {
//        logIn mrUser = new logIn();
//        mrUser.getMrUser();
//    }



    protected boolean verify(String un, String pass) {
        if (un.equals("happyUser") && pass.equals("happyPassword"))
            return TRUE;
        else return FALSE;
    }


    public logIn(String userName,String pw){
        this.userName=userName;
        this.pw=pw;
    }

    public void getMrUser() {

        System.out.println("Welcome, please type your user name: \n");
        //mrUser.userName=myScanner.nextLine();
        String un = myScanner.nextLine();
        // userName=console.readLine();

        System.out.println("Try and guess your password: \n");
        // mrUser.pw=myScanner.nextLine();
       String tempPass = myScanner.nextLine();

        if (verify(un, tempPass)) {
            System.out.println("\nCongratulations, you are logged in!");
        } else
            System.out.println("\n Incorrect username or password, please try again! ");
    }
}


