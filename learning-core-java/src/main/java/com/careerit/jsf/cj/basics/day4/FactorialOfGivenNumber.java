package com.careerit.jsf.cj.basics.day4;

import java.util.Scanner;

public class FactorialOfGivenNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N: ");
    int n = sc.nextInt();
    int fact = 1;
    for (int i = n; i >=1; i--) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + n + " is :" + fact);

  }
}
