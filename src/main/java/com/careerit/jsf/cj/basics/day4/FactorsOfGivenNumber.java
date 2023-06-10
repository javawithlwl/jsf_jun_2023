package com.careerit.jsf.cj.basics.day4;

import java.util.Scanner;

public class FactorsOfGivenNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num: ");
    int num = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i+" ");
        count++;
      }
    }
    System.out.println("\nTotal factors of "+num+" is :"+count);
    if(count == 2){
        System.out.println(num+" is prime number");
    }else{
        System.out.println(num+" is not a prime number");
    }
  }
}
