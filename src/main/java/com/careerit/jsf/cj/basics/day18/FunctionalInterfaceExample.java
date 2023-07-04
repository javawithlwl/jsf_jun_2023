package com.careerit.jsf.cj.basics.day18;

@FunctionalInterface
interface Operation {
  int perform(int a, int b);
}

class Calc {

  public int calculate(Operation operation, int a, int b) {
    return operation.perform(a, b);
  }

}

public class FunctionalInterfaceExample {
  public static void main(String[] args) {
      Calc obj = new Calc();
      int num1  = 28, num2 = 35;
      int add = obj.calculate((a, b)-> a + b, num1, num2);
      int mul = obj.calculate((a, b)-> a * b, num1, num2);
      int big = obj.calculate((a, b)-> a > b ? a: b, num1, num2);

  }
}
