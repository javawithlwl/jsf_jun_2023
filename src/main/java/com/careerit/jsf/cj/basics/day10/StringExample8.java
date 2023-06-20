package com.careerit.jsf.cj.basics.day10;

public class StringExample8 {

  public static void main(String[] args) {

    StringBuilder sb1 = new StringBuilder("Java");
    StringBuilder sb2 = new StringBuilder("Java");

    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));

    System.out.println(sb1.reverse());
    System.out.println(sb1);

    String name = "12321";

    if(name.equals(new StringBuilder(name).reverse().toString())) {
      System.out.println("Palindrome");
    }
  }
}
