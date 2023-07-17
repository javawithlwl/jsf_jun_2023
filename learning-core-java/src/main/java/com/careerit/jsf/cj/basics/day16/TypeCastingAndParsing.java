package com.careerit.jsf.cj.basics.day16;

public class TypeCastingAndParsing {

  public static void main(String[] args) {

    int a = 10;
    float b = a;
    System.out.println(b);

    float c = 10.5f;
    int d = (int) c;
    System.out.println(d);

    String value = "1001";
    int num = Integer.parseInt(value);
    System.out.println(num);

    Number obj = Integer.valueOf(100);
    if(obj instanceof  Integer) {
       Integer num1 = (Integer) obj;
    }


  }
}
