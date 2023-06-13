package com.careerit.jsf.cj.basics.day5;

import java.util.Scanner;

public class PatternExample2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num: ");
    int num = sc.nextInt();
    int k = 1;
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print(num * k++ + " ");
      }
      System.out.println();
    }
  }
}
