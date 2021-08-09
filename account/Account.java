package com.example.account;

import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
    private LocalDate openingDate;



 public Account(int id, double balance, LocalDate openingDate) {
        this.id = id;
        this.balance = balance;
        this.openingDate = openingDate;

    }
    public void information(){
        System.out.println("your id is:"+id);
        System.out.println("your balance is:"+balance);
        System.out.println("today's date is:"+openingDate);
    }


    public void deposit(double amount)
    {
        if(amount>=0){
            System.out.println("your current balance after deposit is:"+ (this.balance+=amount));
        }
    }
    public void withdraw(double amount)
    {
        if(amount>=0 && this.balance>=amount){
            System.out.println("your current balance after withdraw is:"+(this.balance-=amount));
        }
    }
    public void ShowBalance(){
        System.out.println("your final balance is:"+(this.balance));
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public LocalDate getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }





}
