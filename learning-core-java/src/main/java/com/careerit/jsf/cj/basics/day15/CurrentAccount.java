package com.careerit.jsf.cj.basics.day15;

public class CurrentAccount extends Account{
   private double overDraftAmount;

    public CurrentAccount(int accno,String name,double balance,double overDraftLimit){
        super(accno,name,balance);
        this.overDraftAmount = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance + overDraftAmount){
            System.out.println("Sorry! Insufficient funds");
        }else{
            balance -= amount;
            System.out.println("Amount "+amount+" is debited from your account and your current balance is "+balance);
        }
    }
}
