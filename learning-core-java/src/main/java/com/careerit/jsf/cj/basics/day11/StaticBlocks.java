package com.careerit.jsf.cj.basics.day11;

public class StaticBlocks {

  static {
    System.out.println("sb2");
  }
  public static void main(String[] args) {
    System.out.println("Main method");
  }
  static{
    System.out.println("Static block-2");
  }
}
