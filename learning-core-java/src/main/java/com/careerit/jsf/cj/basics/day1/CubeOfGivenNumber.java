package com.careerit.jsf.cj.basics.day1;

import java.util.Scanner;

public class CubeOfGivenNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num: ");
    int num = sc.nextInt();
    int res = num * num * num;
    System.out.println("Cube of " + num + " is " + res);

  }
}
