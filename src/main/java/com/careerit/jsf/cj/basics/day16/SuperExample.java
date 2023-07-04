package com.careerit.jsf.cj.basics.day16;

class T1 {
  int a = 100;
  T1() {
    System.out.println("T1 constructor");
  }

  void m1() {
    System.out.println("T1 of m1");
  }
}

class T2 extends T1 {
  int a = 200;
  T2() {
    System.out.println("T2 constructor");
  }
  void m1() {
    super.m1();
    System.out.println("T2 of m1");
  }

  void m2() {
    m1();
  }
}

class T3 extends T2 {
  int a = 300;
  T3() {
    System.out.println("T3 constructor");
  }
  void m1() {
    super.m1();
    System.out.println("T3 of m1");
  }


}

public class SuperExample {

  public static void main(String[] args) {
    T1 obj = new T3();
    System.out.println(obj.a);
    obj.m1();

  }
}
