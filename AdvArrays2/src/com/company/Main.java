package com.company;

import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();
        String user = "";
        String pass = "";
        String logUser = "";
        String logPass = "";

        while(true){
            System.out.println("Would you like to create an account");
            String log = kboard.nextLine();

                if(log.equals("create account") || log.equals("Create account") || log.equals("Create Account")) {
                    while(true) {
                        System.out.println("Enter Username");
                        user = kboard.nextLine();
                         if(checkUser(user, username, true)==-1){
                             username.add(user);
                             break;
                         }
                    }
                    System.out.println("Enter Password");
                    pass = kboard.nextLine();
                    password.add(pass);
                    System.out.println("You Have Created Account");

                }
                if(log.equals("login") || log.equals("Login")) {
                    System.out.println("Enter Username");
                    logUser = kboard.nextLine();
                    System.out.println("Enter Password");
                    logPass = kboard.nextLine();
                    int unIndex = checkUser(logUser, username, false);



                    if (checkUser(logUser, username, false) == -1 || logPass.equals(password.get(unIndex))) {
                        System.out.println("Username or Password is Incorrect!!");
                    } else if (unIndex != -1) {
                        if (logPass.equals(password.get(unIndex))) {
                            System.out.println("Username or Password is Incorrect!!");
                        } else {
                            System.out.println("Welcome");
                        }
                    }
                }
        }

    }
    static int checkUser (String Username, ArrayList<String> Usernames, boolean create){
        int TF = -1;
        for(int i = 0; i < Usernames.size(); i++) {
            if (Username.equals(Usernames.get(i))){
                if(create) {
                    System.out.println("Username Taken");
                }
                TF = i;
                return TF;
            }
        }
        return TF;
    }

}
    // INPUT:
    //create account
    //Enter Username:
        //enters u
    //enter password
        //enters 9


// INPUT:
//create account
//Enter Username:
//enters i
//enter password
//enters 8


// INPUT:
//login
//enter username
// u
//enter password
//9
//OUTPUT:
//Welcome


// INPUT:
//login
//enter username
// i
//enter password
//9
//OUTPUT:
//Wrong password

