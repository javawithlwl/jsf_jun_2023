package com.careerit.jsf.cj.basics.day9;

import java.util.Arrays;

public class StringExample1 {

  public static void main(String[] args) {
    String name = "krishna";

    System.out.println(name.length());
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(name.length() - 1));

    // count the no of vowels and consonants in the given name
    int vcount = 0;
    int ccount = 0;
    for(int i=0;i<name.length();i++) {
        char ch = name.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vcount++;
        }else {
           ccount++;
        }
    }
    System.out.println("Vowels :"+vcount);
    System.out.println("Consonants :"+ccount);

    for(int i = name.length()-1;i>=0;i--) {
        System.out.print(name.charAt(i));
    }
    System.out.println("\n"+"-".repeat(50));
    String s1 = "catt";
    String s2 = "tacl";
    System.out.println(isAnagram(s1, s2));

    String str = "cat";
    String arr[] = {"tac","act","atc","tca","cat","cta"};

  }
  private static int anagramCount(String str,String[] arr) {
      int count = 0;
      for(String s:arr) {
          if(isAnagram(str, s)) {
              count++;
          }
      }
      return count;
  }

  private static boolean isAnagram(String s1,String s2) {
      if(s1.length() != s2.length()) {
          return false;
      }
      char[] arr1 = s1.toCharArray();
      char[] arr2 = s2.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      return Arrays.equals(arr1, arr2);
  }
}
