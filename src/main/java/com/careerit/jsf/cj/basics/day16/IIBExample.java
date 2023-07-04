package com.careerit.jsf.cj.basics.day16;

public class IIBExample {

  static {
    System.out.println("I am static block 1");
  }

  public static void main(String[] args) {
    System.out.println("I am main method");
    IIBExample obj1 = new IIBExample();
    IIBExample obj2 = new IIBExample();

  }

  {
    System.out.println("I am instance block 1");
  }

  static {
    System.out.println("I am static block 2");
  }
}
