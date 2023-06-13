package com.careerit.jsf.cj.basics.day5;

public class NestedForExample {

  public static void main(String[] args) {
    int n = 15;
    for (int i = 0, j = n-1; i <= j; i++, j--) {
      System.out.println(i + " " + j);
    }
  }
}
