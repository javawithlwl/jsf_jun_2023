package com.careerit.jsf.cj.basics.day15;
class One{
    void m1(){
        System.out.println("One of m1");
    }
    Number add(int a,int b){
        return a+b;
    }
}
class Two extends One{
    void m1(){
        System.out.println("Two of m1");
    }
    @Override
    Float add(int a,int b){
        return (float)a+b;
    }

    void m2(){
        System.out.println("Two of m2");
    }
}

class C1{
    public C1(int a){
       System.out.println("C1 class constructor");
    }
}
class C2 extends C1{
    public C2(){
        super(10);
      System.out.println("C2 class constructor");
    }
}

class CC1{
    int totalCount = 10;
    void m1(){
        System.out.println("CC1 of m1");
    }
    void m2(){
        System.out.println("CC1 of m2");
    }
}
class CC2 extends  CC1{
    int totalCount = 100;
    void m1(){
        System.out.println("CC2 of m1");
    }

    void m3(){
      System.out.println("CC2 of m3");
    }
    void m4(){
        System.out.println("CC2 of m4");
    }
}

public class OverrideExample {

    public static void main(String[] args) {
//       CC1 obj = new CC1();
//       obj.m1();
//       obj.m2();
//
//        CC2 obj1 = new CC2();
//        obj1.m1();
//        obj1.m2();
//        obj1.m3();
//        obj1.m4();

        CC1 obj3 = new CC2();
        obj3.m1();
        obj3.m2();
        System.out.println(obj3.totalCount);

    }
}
