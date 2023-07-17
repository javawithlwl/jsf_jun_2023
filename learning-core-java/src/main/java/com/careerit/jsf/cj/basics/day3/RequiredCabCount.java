package com.careerit.jsf.cj.basics.day3;

import java.util.Scanner;

public class RequiredCabCount {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of people: ");
    int num = sc.nextInt();
    System.out.println("Enter the capacity of cab: ");
    int capacity = sc.nextInt();
//    int requiredCabs = 0;
//    if(num % capacity == 0) {
//      requiredCabs = num / capacity;
//    }else {
//      requiredCabs = num / capacity + 1;
//    }
    int requiredCabs = (num % capacity == 0) ? num / capacity : num / capacity + 1;
    System.out.println("For "+num+" people with capacity of "+capacity +" required cabs are :"+requiredCabs);
  }
}
