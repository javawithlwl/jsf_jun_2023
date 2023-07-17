package com.careerit.jsf.cj.basics.day18;
interface One{
    void m1();
}
interface Two{
    void m1();
    void m2();
}
interface Three extends One, Two{
    void m3();
}
class C1 implements  One,Two,Three{
      @Override
      public void m1() {
      }
      @Override
      public void m2() {
      }
      @Override
      public void m3() {
      }
}
interface TagInfo{
}
public class InterfaceExample implements Cloneable {
}
