package com.careerit.jsf.cj.basics.day2;

import java.util.Scanner;

public class EmiCalculator {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal amount: ");
    double p = sc.nextDouble();
    System.out.println("Enter the rate of interest: ");
    double r = sc.nextDouble();
    System.out.println("Enter the number of time periods elapsed: ");
    double t = sc.nextDouble();
    r = ((r / 12) / 100);
    double emi = p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1);
    System.out.println("Principal amount : " + p);
    System.out.println("Rate of interest : " + r);
    System.out.println("Number of months : " + t);
    System.out.println("EMI amount : " + emi);
    System.out.println("Total interest amount : " + (emi * t - p));

  }
}
