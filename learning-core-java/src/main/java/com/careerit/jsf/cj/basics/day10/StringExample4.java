package com.careerit.jsf.cj.basics.day10;

public class StringExample4 {

  public static void main(String[] args) {
    String data = "12321,4589,mom,dad,liril,john,krish";
    for(String word:data.split(",")){
      if(isPalindrome(word)){
        System.out.println(word);
      }
    }
  }

  private static boolean isPalindrome(String data) {
    StringBuilder sb = new StringBuilder(data);
    return sb.reverse().toString().equals(data);
  }
}
