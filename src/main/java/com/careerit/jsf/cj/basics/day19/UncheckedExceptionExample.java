package com.careerit.jsf.cj.basics.day19;

public class UncheckedExceptionExample {

  public static void main(String[] args) {
    System.out.println("Start of main method");
    int[] arr = {1, 2, 3, 4, 5};
    try {
      System.out.println(arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index is not valid");
    }
    System.out.println("End of main method");
  }
}
