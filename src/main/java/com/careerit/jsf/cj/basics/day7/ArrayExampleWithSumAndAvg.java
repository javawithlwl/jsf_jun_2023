package com.careerit.jsf.cj.basics.day7;

import java.util.Scanner;

public class ArrayExampleWithSumAndAvg {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array :");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++) {
        System.out.println("Enter the "+(i+1)+" element :");
        arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0;i<arr.length;i++) {
       sum += arr[i];
    }
    double avg = sum / arr.length;

    System.out.println("Sum :"+sum);
    System.out.println("Avg :"+avg);


  }
}
