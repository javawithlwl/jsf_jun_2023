package com.careerit.jsf.cj.basics.day6;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1 value: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the num2 value: ");
    int num2 = sc.nextInt();
    while(true){
      System.out.println("1. Add 2. Sub 3. Mul 4. Div 5. Exit");
      System.out.println("Enter your choice :");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          break;
        case 2:
          System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
          break;
        case 3:
          System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
          break;
        case 4:
          System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
          break;
        case 5:
          System.out.println("Thanks for using our app");
          System.exit(0);
        default:
          System.out.println("Invalid choice");
      }
      System.out.println("Do you want to continue : (1 - Yes)");
      int choice = sc.nextInt();
      if(choice != 1){
        System.out.println("Thanks for using our app");
        break;
      }
    }
  }
}
