package com.careerit.jsf.cj.basics.day10;

import java.util.Arrays;

public class StringExample9 {

  public static void main(String[] args) {

    String s1 = "Hello";
    String s2 = "olleH";
    System.out.println(isAnagram(s1, s2));
    System.out.println(isAnagram("CAT", "CTA"));
    System.out.println(isAnagram("CAT", "BTA"));
  }

  private static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }
}
