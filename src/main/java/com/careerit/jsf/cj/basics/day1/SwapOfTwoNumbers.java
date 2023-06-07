package com.careerit.jsf.cj.basics.day1;

import java.util.Scanner;

public class SwapOfTwoNumbers {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2: ");
    int num2 = sc.nextInt();
    System.out.println("Before swapping num1: " + num1 + " and num2: " + num2);
    /* int temp = num1;
        num1 = num2;
        num2 = temp; */
    // Swap two numbers without using temp variable
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    System.out.println("After swapping num1: " + num1 + " and num2: " + num2);
  }
}
