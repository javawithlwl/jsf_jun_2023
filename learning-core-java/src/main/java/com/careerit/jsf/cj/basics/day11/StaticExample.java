package com.careerit.jsf.cj.basics.day11;

import static java.lang.System.out;
import static com.careerit.jsf.cj.basics.day11.NumberOperations.*;

public class StaticExample {

  public static void main(String[] args) {
    out.println(add(10, 20));
    out.println(sub(10, 20));
    out.println(mul(10, 20));
    out.println(div(10, 20));
    out.println(factorial(6));
    out.println(isPrime(13));
    out.println(isPrime(15));
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int sub(int a, int b) {
    return a - b;
  }

  public static int mul(int a, int b) {
    return a * b;
  }

  public static int div(int a, int b) {
    return a / b;
  }

}
