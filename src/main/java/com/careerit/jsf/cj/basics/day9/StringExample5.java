package com.careerit.jsf.cj.basics.day9;

public class StringExample5 {

  public static void main(String[] args) {

    String data = "Welcome to Java world";

    System.out.println(data.toUpperCase());
    System.out.println(data.toLowerCase());
    System.out.println(data.startsWith("Welcome"));
    System.out.println(data.endsWith("world"));
    System.out.println(data.contains("Java"));
    System.out.println(data.indexOf("Java"));
    System.out.println(data.lastIndexOf("Java"));
    System.out.println(data.charAt(0));
    System.out.println(data.charAt(data.length() - 1));
    System.out.println(data.substring(0, 7));
    System.out.println(data.substring(8));

    System.out.println(" Hello World ".trim());
    crateWords("welcome", 3);

  }

  // welcome  2  =>
  public static void crateWords(String data, int n) {
    for (int i = 0; i <= data.length() - n; i++) {
      System.out.println(data.substring(i, i + n));
    }
  }

  public static String[] getCompanyName(){
      String data = "john@google.com,mani@facebook.com,mahesh@facebook.com,amar@infosys.com,tanvi@infosys.com,kiran@her.io";
      //Logic
      return null;
  }
}
