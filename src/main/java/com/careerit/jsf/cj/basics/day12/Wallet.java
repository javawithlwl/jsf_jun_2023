package com.careerit.jsf.cj.basics.day12;

public class Wallet {
  long id;
  String name;
  double balance;

  public Wallet(int id,String name, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public void showDetails() {
    System.out.println("Id :" + id);
    System.out.println("Name :" + name);
    System.out.println("Balance :" + balance);
  }

  public static void main(String[] args) {
    Wallet wallet1 = new Wallet(1001,"Krish", 45000);
    Wallet wallet2 = new Wallet(1002,"Manoj", 55000);
    Wallet wallet3 = new Wallet(1003,"Charan", 65000);
    wallet1.showDetails();
    wallet2.showDetails();
    wallet3.showDetails();
  }
}
