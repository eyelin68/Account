package com.example.main;

import com.example.person.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("enter firstname:");
        String firstname = scanner.nextLine();
        System.out.println("enter lastname:");
        String lastname = scanner.nextLine();
        System.out.println("enter address:");
        String address = scanner.nextLine();
        System.out.println("enter id:");
       int id = scanner.nextInt();
        System.out.println("enter balance:");
        double balance = scanner.nextDouble();
        Person p1 = new Person(firstname, lastname, address, id, balance, date);
        System.out.println("Menu");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Show balance:");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");
        int menu;
        menu = scanner.nextInt();
        while (menu < 5) {

            switch (menu) {
                case 1:
                    System.out.println("enter deposit:");
                    p1.deposit();
                    break;
                case 2:
                    System.out.println("enter withdraw:");
                    p1.withdraw();
                    break;
                case 3:
                    System.out.println("your balance is:");
                    p1.balance();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            System.out.println("Menu");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Show balance:");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            menu = scanner.nextInt();


        }
    }
}
