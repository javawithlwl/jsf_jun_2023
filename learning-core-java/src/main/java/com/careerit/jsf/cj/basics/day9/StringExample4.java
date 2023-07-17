package com.careerit.jsf.cj.basics.day9;

import java.util.Scanner;

public class StringExample4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(StringExample4.class.getResourceAsStream("/employee_data.csv"));
    while (sc.hasNextLine()) {
      String data = sc.nextLine();
      String[] arr = data.split(",");
      if(arr[2].equals("20")){
        System.out.println(data);
      }
    }
    sc.close();
  }
}
