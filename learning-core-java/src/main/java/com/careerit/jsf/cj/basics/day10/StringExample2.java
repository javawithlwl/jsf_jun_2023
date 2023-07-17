package com.careerit.jsf.cj.basics.day10;

public class StringExample2 {

  public static void main(String[] args) {

    String s1 = "Hello";
    String s2 = new String("Hello").concat(" World");
    System.out.println(s2);
    String s3 = "Hello World";
    System.out.println(s2 == s3);
    System.out.println(s2.equals(s3));

    String[] names = new String[] {"Krish","Manoj","Charan","Tanvi"};

    String formattedData = String.join(":", names);
    System.out.println(formattedData);


  }
}
