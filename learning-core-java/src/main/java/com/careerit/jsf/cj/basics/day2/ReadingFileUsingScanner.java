package com.careerit.jsf.cj.basics.day2;

import java.util.Scanner;

public class ReadingFileUsingScanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(ReadingFileUsingScanner.class.getResourceAsStream("/names.txt"));
    while(sc.hasNext()) {
      String name = sc.nextLine();
      System.out.println(name);
    }
  }
}
