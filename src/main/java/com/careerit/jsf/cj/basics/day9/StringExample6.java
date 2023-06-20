package com.careerit.jsf.cj.basics.day9;

public class StringExample6 {

  public static void main(String[] args) {

    String s1 = "Java";
    String s2 = "Java";
    String s3 = "Java";

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);

    s1 = s1.concat(" is a programming language");
    System.out.println(s1);
  }
}
