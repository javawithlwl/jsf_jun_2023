package com.careerit.jsf.cj.basics.day10;

public class StringExample5 {

  public static void main(String[] args) {

    String data = "Hello Welcome to Java World";
    int len = data.substring(0, 7).trim().toUpperCase().length();
    System.out.println(len);
    String[] arr = data.split(" ");
    String name = arr[arr.length-1].trim().substring(0).toUpperCase();
    System.out.println(name);

  }
}
