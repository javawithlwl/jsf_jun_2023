package com.careerit.jsf.cj.basics.day5;

public class BreakAndContinue {

  public static void main(String[] args) {

    System.out.println("Start of main method");
    for (int i = 1; i <= 10; i++) {

      if (i % 3 == 0 && i % 6 == 0) {
        continue;
      }
      System.out.println(i);

    }
    System.out.println("End of main method");

  }
}
