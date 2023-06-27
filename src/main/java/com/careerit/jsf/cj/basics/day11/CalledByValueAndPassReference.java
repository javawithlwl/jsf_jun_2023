package com.careerit.jsf.cj.basics.day11;

import java.util.Arrays;

public class CalledByValueAndPassReference {


  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Before swap a = " + a + " and b = " + b);
    swap(a, b);
    System.out.println("After swap a = " + a + " and b = " + b);

    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Before increment : " + Arrays.toString(arr));
    increment(arr);
    System.out.println("After increment : " + Arrays.toString(arr));
  }

  public static void increment(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] + 1;
    }
  }

  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
  }

  // recursive methods

  public static int fact(int num) {
    if (num == 1) {
      return 1;
    }
    return num * fact(num - 1);
  }
  // 24  40
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);           // 40, 24 => 24 16 => 16 8 => 8 0
  }
  public static int fibonacci(int num){
      if(num <= 1){
          return num;
      }
      return fibonacci(num-1) + fibonacci(num-2);
  }


}
