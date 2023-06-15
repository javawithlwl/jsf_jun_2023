package com.careerit.jsf.cj.basics.day7;

public class ArrayExample {

  public static void main(String[] args) {

    int[] arr = new int[]{1,2,3,4,9,8,7,6};

    System.out.println("Array length : " + arr.length);

    int sum = 0;
    for(int i=0;i<arr.length;i++) {
       sum += arr[i];
    }
    double avg = sum / arr.length;
    System.out.println("Sum :"+sum);
    System.out.println("Avg :"+avg);

  }
}
