package com.careerit.jsf.cj.basics.day2;

import java.util.Scanner;

public class PersonDetails {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name = sc.nextLine();
    System.out.println("Enter the age: ");
    int age = sc.nextInt();
    System.out.println("Enter the height: ");
    double height = sc.nextDouble();

    System.out.println("Name: " + name+" Age: "+age+" Height: "+height);
  }
}
