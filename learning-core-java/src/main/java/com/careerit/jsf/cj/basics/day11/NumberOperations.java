package com.careerit.jsf.cj.basics.day11;

public class NumberOperations {

      public static int factorial(int num){
          int res = 1;
          for(int i=2;i<=num;i++){
              res *=i;
          }
          return res;
      }
      public static boolean isPrime(int num){
          if(num < 2){
              return false;
          }
          for(int i=2;i<=num/2;i++){
              if(num % i == 0){
                  return false;
              }
          }
          return true;
      }
      public static boolean isPalindrome(int num){
          int temp = num;
          int rev = 0;
          while(temp != 0){
              int r = temp % 10;
              rev = rev * 10 + r;
              temp = temp / 10;
          }
          return num == rev;
      }
      public static int sumOfDigits(int num){
          int sum = 0;
          while(num != 0){
              int r = num % 10;
              sum += r;
              num = num / 10;
          }
          return sum;
      }
      public static int sumOfDigits(int num,int times){
          int sum = 0;
          while(num != 0){
              int r = num % 10;
              sum += Math.pow(r,times);
              num = num / 10;
          }
          return sum;
      }
      public static boolean isArmStrong(int num){
          return num == sumOfDigits(num,3);
      }
      public static boolean isPerfect(int num){
          return num == sumOfDigits(num,1);
      }
}
