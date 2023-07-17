package com.careerit.jsf.cj.basics.day19;

class E1Exception extends Exception{}
class E2Exception extends E1Exception {}
class E3Exception extends E2Exception{}

class A{
    public void m1() throws E3Exception{}
}
class B extends A{
    public void m1() {}
}
public class OverrideWithExample {
}
