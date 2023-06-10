package com.careerit.jsf.cj.basics.day4;

import java.util.Scanner;

public class SumOfFirstNEvenAndOddNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N: ");
    int n = sc.nextInt();
    int even_sum = 0;
    int odd_sum = 0;
    for (int i = 1; i <= n; i++) {
        if(i % 2 == 0) {
          even_sum += i;
        }else {
          odd_sum += i;
        }
    }
    System.out.println("Sum of first "+n+" even numbers is :"+even_sum);
    System.out.println("Sum of first "+n+" odd numbers is :"+odd_sum);
  }
}
