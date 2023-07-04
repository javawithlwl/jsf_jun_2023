package com.careerit.jsf.cj.basics.day16;
class SuperCalc{
  {
    System.out.println("I am Super class IIB");
  }
  SuperCalc(){
    System.out.println("I am Super class constructor");
  }
}
class Calc extends  SuperCalc {
  private static int count = 0;
  Calc(int a, int b) {
    System.out.println("I am constructor with two args");
  }

  Calc(int a, int b, int c) {
    System.out.println("I am constructor with three args");
  }

  Calc(int a, int b, int c, int d) {
    System.out.println("I am constructor with Four args");
  }

  {
    count++;
    System.out.println("IIB Block -1");
  }

}

public class IIBExampleWithCount {
  public static void main(String[] args) {
    Calc obj = new Calc(10, 20, 40);
  }
}
