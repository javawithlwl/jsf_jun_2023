package com.careerit.jsf.cj.basics.day1;

import java.util.Scanner;

public class SumOfTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2: ");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    double avg = sum / 2.0;
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum+" and average is "+avg);
  }
}
