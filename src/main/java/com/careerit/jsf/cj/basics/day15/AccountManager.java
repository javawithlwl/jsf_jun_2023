package com.careerit.jsf.cj.basics.day15;

public class AccountManager {

  public static void main(String[] args) {
    Account account = new Account(1001, "Krish", 5000);
    account.deposit(5000);
    account.withdraw(1000);
    account.withdraw(10000);
    account.showInfo();
  }
}
