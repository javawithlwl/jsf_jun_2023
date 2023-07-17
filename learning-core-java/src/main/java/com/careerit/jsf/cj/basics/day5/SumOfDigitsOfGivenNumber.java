package com.careerit.jsf.cj.basics.day5;

public class SumOfDigitsOfGivenNumber {

  public static void main(String[] args) {
    int num = 63981;
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      num = num / 10;

    }
    System.out.println("Sum of digits of given number is :" + rev);
  }
}