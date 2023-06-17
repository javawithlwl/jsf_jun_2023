package com.careerit.jsf.cj.basics.day9;

public class StringExample2 {

  public static void main(String[] args) {

    String data = "1001-Krish-45000,1002-Manoj-56000,1003-Charan-67000,1004-Tanvi-89000";

    String[] arr = data.split(",");
    for (String str : arr) {
      String[] res = str.split("-");
      long empno = Long.parseLong(res[0]);
      String name = res[1];
      double salary = Double.parseDouble(res[2]);
      System.out.println("Empno  :" + empno);
      System.out.println("Name   :" + name);
      System.out.println("Salary :" + salary);
      System.out.println("-".repeat(50));
    }


  }
}
