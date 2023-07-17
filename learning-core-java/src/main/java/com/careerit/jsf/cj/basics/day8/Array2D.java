package com.careerit.jsf.cj.basics.day8;

import java.util.Arrays;

public class Array2D {

  public static void main(String[] args) {

//    int[][] arr = new int[][]{{1, 2, 3, 4}, {4, 5, 6, 4}, {7, 8, 9, 5}};
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = 0; j < arr[i].length; j++) {
//        System.out.print(arr[i][j] + " ");
//      }
//      System.out.println();
//
//    }
    int[][] res = sum(new int[][]{{1, 2, 3}, {2, 3, 4}}, new int[][]{{1, 2, 3}, {2, 3, 4}});
    for (int[] a : res) {
      System.out.println(Arrays.toString(a));
    }
    int[][] eleArr = new int[][]{
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}
    };

    for (int[] arr1 : eleArr) {
      for (int ele : arr1) {
        if (ele == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }

  private static int sumOfElement(int[][] arr) {
    return 0;
  }

  private static int[] columnSum(int[][] arr) {
    return null;
  }

  private static int[] rowSum(int[][] arr) {
    return null;
  }

  private static int maxElement(int[][] arr) {
    return 0;
  }

  private static int minElement(int[][] arr) {
    return 0;
  }

  private static int[][] transpose(int[][] arr) {
    return null;
  }

  private static int[][] product(int[][] arr1, int[][] arr2) {
    return null;
  }

  private static int[][] sum(int[][] arr1, int[][] arr2) {
    if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
      throw new IllegalArgumentException("Invalid matrix size");
    }
    int[][] arr = new int[arr1.length][arr1[0].length];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        arr[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    return arr;
  }
}
