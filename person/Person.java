package com.example.person;

import com.example.account.Account;


import java.time.LocalDate;
import java.util.Scanner;


public class Person {
    private String firstname;
    private String lastname;
    private String address;
    private Account account;

    public Person(String firstname, String lastname, String address, int id, double balance, LocalDate openingDate) {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        account=new Account(id, balance, openingDate);

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void fullDetails(){

        System.out.println("firstname:" +firstname);
        System.out.println("lastname:" +lastname);
        System.out.println("address:" +address);

    }
    public void deposit(){
        Scanner scanner=new Scanner(System.in);
        account.deposit(scanner.nextInt());
    }
    public void withdraw(){
        Scanner scanner=new Scanner(System.in);
        account.withdraw(scanner.nextInt());
    }
    public void balance(){
        account.ShowBalance();
    }

}
