package com.careerit.jsf.cj.basics.day7;

public class Account {

      private int accno;
      private String name;
      private double balance;

      public Account(int accno,String name,double balance){
          this.accno = accno;
          this.name = name;
          this.balance = balance;
      }
      public void withdraw(double amount){
          if(amount > balance){
              System.out.println("Sorry! Insufficient funds");
          }else{
              balance -= amount;
              System.out.println("Amount "+amount+" is debited from your account and your current balance is :"+balance);
          }
      }
      public void deposit(double amount){
          balance += amount;
          System.out.println("Amount "+amount+" is credited to your account and your current balance is :"+balance);
      }
      public void showInfo(){
          System.out.println("Account number :"+accno);
          System.out.println("Name           :"+name);
          System.out.println("Balance        :"+balance);
      }
}
