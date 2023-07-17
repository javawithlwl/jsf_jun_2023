package com.careerit.jsf.cj.basics.day7;

public class PrimeDigitCountInNumber {

  public static void main(String[] args) {

    int num = 623754;
    int res = countOfPrimeDigits(num);
    System.out.println("Count of prime digits in " + num + " is :" + res);
    System.out.println("Single digit sum of " + num + " is :" + singleDigitSum(num));

  }

  public static int countOfPrimeDigits(int num){
      int count = 0;
      while(num != 0){
          int r = num % 10;
          if(isPrime(r)){
              count++;
          }
          num = num / 10;
      }
      return count;
  }

  public static boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int singleDigitSum(int num){
        while(num > 9){
              num = num % 10 + num / 10;
        }
        return num;
  }
}
