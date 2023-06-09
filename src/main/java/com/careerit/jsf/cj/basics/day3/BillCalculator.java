package com.careerit.jsf.cj.basics.day3;

import java.util.Scanner;

public class BillCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name :");
    String name = sc.nextLine();
    System.out.println("Enter the bill amount :");
    double billAmount = sc.nextDouble();

    double discount = 0;
    if(billAmount >= 5000) {
      discount = billAmount * 0.2;
    }else{
      discount = billAmount * 0.05;
    }
    double netAmount = billAmount - discount;

    System.out.println("Name :"+name);
    System.out.println("Bill Amount :"+billAmount);
    System.out.println("Discount :"+discount);
    System.out.println("Net Amount :"+netAmount);

  }
}
