package com.careerit.jsf.cj.basics.day16;

class A {
    int a = 100;
    void m1(){
        System.out.println("A of m1");
    }

}
class B extends  A{
    int a = 200;
    void m1(){
        System.out.println("B of m1");
    }
    void m2(){
        m1();
    }
}

public class InheritanceExample {

      public static void main(String[] args) {
          A a = new B();
          B b = (B)a;
          b.m1();
          b.m2();

      }
}
