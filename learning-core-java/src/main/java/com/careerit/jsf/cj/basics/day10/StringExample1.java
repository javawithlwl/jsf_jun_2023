package com.careerit.jsf.cj.basics.day10;

public class StringExample1 {

  public static void main(String[] args) {

    String s1 = "JAVA";
    String s2 = "JAVA";
    String s3 = new String("JAVA");
    String s4 = new String("java");
    System.out.println(s1 == s2);
    System.out.println(s3 == s4);

    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s4));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equalsIgnoreCase(s4));

  }
}
