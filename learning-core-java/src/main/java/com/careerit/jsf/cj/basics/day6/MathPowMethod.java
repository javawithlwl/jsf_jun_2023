package com.careerit.jsf.cj.basics.day6;

public class MathPowMethod {

  public static void main(String[] args) {
    int m = 5;
    int n = 3;
    System.out.println(pow(m, n));
    System.out.println(countFactors(18));
  }

  public static int pow(int m, int n) {
    int res = 1;
    for (int i = 1; i <= n; i++) {
      res *= m;
    }
    return res;
  }
  // get count of factors of given number
  public static int countFactors(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    return count;
  }

}
