package com.careerit.jsf.cj.basics.day6;

import java.time.LocalDate;

public class MethodExample {

  public static void main(String[] args) {

  }
  // method with arguments and return type
  public static int add(int a,int b) {
    return a+b;
  }
  // method with arguments and no return type
  public static void showData(String message){
    System.out.println(message);
  }
  // method with no arguments and return type
  public static LocalDate getSystem(){
    return LocalDate.now();
  }
  // method with no arguments and no return type
  public static void showSystemInfo(){
    System.out.println("OS : Windows 10");
  }
}
