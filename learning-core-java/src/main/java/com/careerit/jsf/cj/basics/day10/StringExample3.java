package com.careerit.jsf.cj.basics.day10;

public class StringExample3 {

  public static void main(String[] args) {
    String data = "123219";

    boolean flag = true;

    for (int i = 0, j = data.length() - 1; i <= j; i++, j--) {
      if (data.charAt(i) != data.charAt(j)) {
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println("Given string is palindrome");
    } else {
      System.out.println("Given string is not palindrome");
    }

  }
}
