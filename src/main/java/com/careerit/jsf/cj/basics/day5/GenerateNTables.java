package com.careerit.jsf.cj.basics.day5;

import java.util.Scanner;

public class GenerateNTables {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the N value :");
      int N = sc.nextInt();
      for(int i=1;i<=N;i++) {
        for (int j = 1; j <= 10; j++) {
          System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
        System.out.println("-------------------");
      }
    }
}
