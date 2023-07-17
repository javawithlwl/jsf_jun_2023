package com.careerit.jsf.cj.basics.day4;

public class FibonacciSeries {

  public static void main(String[] args) {
    int a = 0, b = 1;
    System.out.print(a+" ");
    System.out.print(b+" ");
    for (int i = 1; i <= 10; i++) {
        int res = a + b;
        System.out.print(res+" ");
        a = b;
        b = res;
    }

  }
}
