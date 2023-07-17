package com.careerit.jsf.cj.basics.day10;

import java.util.Scanner;

public class StringExample7 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(StringExample7.class.getResourceAsStream("/emp_names.txt"));
    StringBuilder sb = new StringBuilder();
    while (sc.hasNextLine()) {
      String name = sc.nextLine();
      sb.append(name).append(",");
    }
    String data = sb.substring(0, sb.length() - 1);
    System.out.println(data);
  }
}
