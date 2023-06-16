package com.careerit.jsf.cj.basics.day8;

public class ArrayPalindrome {

  public static void main(String[] args) {

//    System.out.println(isPalindrome(new int[]{1, 2, 3, 4, 3, 2, 1}));
//    System.out.println(isPalindrome(new int[]{1, 2, 3, 4, 3, 2, 2}));
    System.out.println(search(new int[]{1, 2, 3, 4, 3, 2, 2}, 2));
    System.out.println(search(new int[]{1, 2, 3, 4, 3, 2, 2}, 5));
  }

  private static boolean isPalindrome(int[] arr) {
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
      if (arr[i] != arr[j]) {
        return false;
      }
    }
    return true;
  }

  // If element is present return index else return -1
  private static int search(int[] arr, int ele) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ele) {
        return i;
      }
    }
    return -1;
  }

  private static int maxElement(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  private static int minElement(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  private static boolean search(int[] arr, int a, int b, int c) {
    return search(arr, a) != -1 && search(arr, b) != -1 && search(arr, c) != -1;
  }
}
