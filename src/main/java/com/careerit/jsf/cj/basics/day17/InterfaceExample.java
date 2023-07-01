package com.careerit.jsf.cj.basics.day17;

import java.util.ArrayList;
import java.util.List;

interface NumberOperations {
  boolean isPrime(int num);
  int gcd(int a, int b);
  int reverse(int num);
  default int primeCountInRange(int lb, int ub){
      int count = 0;
      for(int i=lb;i<=ub;i++){
          if(isPrime(i)){
              count++;
          }
      }
      return count;
  }
  default List<Integer> primeInRange(int lb,int ub){
      List<Integer> list = new ArrayList<>();
      for(int i=lb;i<=ub;i++){
          if(isPrime(i)){
              list.add(i);
          }
      }
      return list;
  }
  private int bigNumber(int num1,int num2){
    return num1 > num2 ? num1 : num2;
  }

  static int factorial(int num){
      int res = 1;
      for(int i=2;i<=num;i++){
          res *= i;
      }
      return res;
  }
  private static int sum(int... arr){
      int sum = 0;
      for(int ele:arr){
          sum += ele;
      }
      return sum;
  }

}

class BasicNumberOperations implements NumberOperations {
  @Override
  public boolean isPrime(int num) {
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

  @Override
  public int gcd(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  @Override
  public int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      num = num / 10;
    }
    return rev;
  }
}

class AdvancedNumberOperations implements NumberOperations {
  @Override
  public boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= (int) Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public int gcd(int a, int b) {
      if(a == b)
          return a;
      else
          return a > b ? gcd(a-b,b) : gcd(a,b-a);
  }

  @Override
  public int reverse(int num) {
      if(num >=0 && num <= 9){
        return num;
      }
      int rev = 0;
      while(num != 0){
          int r = num % 10;
          rev = rev * 10 + r;
          num = num / 10;
      }
      return rev;
  }
}

public class InterfaceExample {

  public static void main(String[] args) {

        NumberOperations obj = new AdvancedNumberOperations();
        int res = obj.gcd(24,28);
        System.out.println(res);
        boolean flag = obj.isPrime(13);
        System.out.println(flag);
        int rev = obj.reverse(1234);
        System.out.println(rev);
        int primeList = obj.primeCountInRange(1, 100);
  }
}
