package com.careerit.jsf.cj.basics.day7;

public class AccountManager {

  public static void main(String[] args) {

    Account acc1 = new Account(1001, "Krish", 5000);
    acc1.showInfo();
    acc1.deposit(4000);
    acc1.withdraw(3000);
    acc1.withdraw(2000);

    Account acc2 = new Account(1002, "Manoj", 2000);
    acc2.deposit(1000);
    acc2.deposit(1000);

    acc1.showInfo();
    acc2.showInfo();

  }
}
