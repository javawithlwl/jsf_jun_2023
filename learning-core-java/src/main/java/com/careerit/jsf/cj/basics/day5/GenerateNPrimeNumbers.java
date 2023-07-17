package com.careerit.jsf.cj.basics.day5;

public class GenerateNPrimeNumbers {

  public static void main(String[] args) {
    int n = 100;
    int count = 0;
    for (int l = 2; ; l++) {
      boolean isPrime = true;
      int num = l;
      for (int i = 2; i <= n / 2; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(num + " ");
        count++;
      }
      if(count == n){
          break;
      }
    }
  }
}
