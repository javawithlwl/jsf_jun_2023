package com.careerit.jsf.cj.basics.day7;

public class CalculatorManger {

  public static void main(String[] args) {

          Calculator cal = new Calculator(10, 20);
          System.out.println(cal.add());
          System.out.println(cal.sub());
          System.out.println(cal.mul());
          System.out.println(cal.div());


  }
}
