package com.careerit.jsf.cj.basics.walletsvc;
public class Wallet {

  private Long id;
  private String name;
  private String mobile;
  private double balance;

  public Wallet(String name, String mobile, double balance) {
    if (id == null || id == 0) {
       this.id = IdGenerator.generateId();
    }
    this.name = name;
    this.mobile = mobile;
    this.balance = balance;
  }

  public void showDetails() {
    System.out.println("Id :" + id);
    System.out.println("Name :" + name);
    System.out.println("Mobile :" + mobile);
    System.out.println("Balance :" + balance);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
