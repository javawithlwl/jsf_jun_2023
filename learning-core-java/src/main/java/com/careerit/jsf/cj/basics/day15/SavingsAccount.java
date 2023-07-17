package com.careerit.jsf.cj.basics.day15;

public class SavingsAccount extends Account {
      protected  double minBalance;

      public SavingsAccount(int accno,String name,double balance,double minBalance){
          super(accno,name,balance);
          this.minBalance = minBalance;
      }

      @Override
      public void withdraw(double amount) {
           if(amount > balance-minBalance) {
                 System.out.println("Sorry! Insufficient funds");
           }else {
                 balance -= amount;
                 System.out.println("Amount "+amount+" is debited from your account and your current balance is "+balance);
           }
      }
}
