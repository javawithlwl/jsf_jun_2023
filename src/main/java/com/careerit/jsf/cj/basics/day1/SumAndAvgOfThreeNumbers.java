package com.careerit.jsf.cj.basics.day1;
import java.util.Scanner;
public class SumAndAvgOfThreeNumbers {
  public static void main(String[] args) {
    // Accept three numbers from the user and find the sum and average of the three numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2: ");
    int num2 = sc.nextInt();
    System.out.println("Enter the num3: ");
    int num3 = sc.nextInt();
    int sum = num1 + num2 + num3;
    double avg = sum / 3.0;
    System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + " is " + sum+" and average is "+avg);


  }
}
