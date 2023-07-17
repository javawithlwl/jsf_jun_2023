package com.careerit.jsf.cj.basics.day6;

public class NumberOperations {


  public static void main(String[] args) {

    int lb = 20, ub = 50;
    showPrimes(lb, ub);
    int num = 12321;
    int res = reverse(num);
    System.out.println("Reverse of "+num+" is "+res+" is palindrome :"+isPalindrome(num));
  }

  public static void showPrimes(int lb, int ub) {
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      int r = num % 10;
      rev = rev * 10 + r;
      num = num / 10;
    }
    return rev;
  }

  public static boolean isPalindrome(int num) {
    return num == reverse(num);
  }

  public static boolean isPrime(int num) {
    if (num < 2 && (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int sumOfDigits(int num) {
    int sum = 0;
    while (num != 0) {
      int r = num % 10;
      sum += r;
      num = num / 10;
    }
    return sum;
  }

  public static boolean isArmStrong(int num) {
    int temp = num;
    int sum = 0;
    while (num != 0) {
      int r = num % 10;
      sum += r * r * r;
      num = num / 10;
    }
    return temp == sum;
  }

  public static int factorialOfNumber(int num) {
    int res = 1;
    for (int i = 2; i <= num; i++) {
      res *= i;
    }
    return res;
  }

  public static int sumOfNNumbers(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    return sum;
  }

  public static void printTables(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + (num * i));
    }
  }

  public static boolean isPerfectNumber(int num) {
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return num == sum;
  }

  public static int countDigits(int num) {
    int count = 0;
    while (num != 0) {
      int r = num % 10;
      count++;
      num = num / 10;
    }
    return count;
  }

  public static void printFibonacciSeries(int num) {
    int a = 0, b = 1;
    System.out.print(a + " " + b + " ");
    for (int i = 3; i <= num; i++) {
      int c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }

  public static void printEvenNumbers(int num) {
    for (int i = 2; i <= num; i += 2) {
      System.out.print(i + " ");
    }
  }

  public static void printOddNumbers(int num) {
    for (int i = 1; i <= num; i += 2) {
      System.out.print(i + " ");
    }
  }

  public static void printNumbers(int num) {
    for (int i = 1; i <= num; i++) {
      System.out.print(i + " ");
    }
  }

  public static void printNumbers(int lb, int ub) {
    for (int i = lb; i <= ub; i++) {
      System.out.print(i + " ");
    }
  }

  public static int gcd(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  public static int gcd(int a, int b, int c) {
    return gcd(gcd(a, b), c);
  }

  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  public static int biggest(int a, int b, int c) {
    return (a > b && a > c) ? a : (b > c) ? b : c;
  }

}
