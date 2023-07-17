package com.careerit.jsf.cj.basics.day19;

public class FinallyExample {

  public static void main(String[] args) {

    System.out.println("Start of main method");
    try {
      String name = "Krish";
      System.out.println(name.charAt(10));
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Index is not valid " + e);
    } finally {
      System.out.println("Finally block");
    }
    System.out.println("End of main method");
  }
}
