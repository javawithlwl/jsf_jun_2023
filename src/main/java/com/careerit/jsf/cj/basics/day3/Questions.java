package com.careerit.jsf.cj.basics.day3;

public class Questions {
  public static void main(String[] args) {
    boolean a = false, b = false, c = true;
    if ((a = true) && b && (c = false)) {
      System.out.println("Hello");
    }
    System.out.println(a + " " + b + " " + c);
  }
}
