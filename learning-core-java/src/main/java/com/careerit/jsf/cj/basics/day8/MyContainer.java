package com.careerit.jsf.cj.basics.day8;

import java.util.Arrays;

public class MyContainer {

  public static void main(String[] args) {

    int[] arr = new int[3];
    arr[0] = 10;
    arr[1] = 50;
    arr[2] = 30;
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int index = Arrays.binarySearch(arr, 50);
    System.out.println("Index of 50 is :" + index);

    int[] arr1 = new int[]{2, 3, 4, 5, 8, 9};
    int[] arr2 = new int[]{2, 3, 4, 5, 8, 9};
    System.out.println(Arrays.equals(arr1, arr2));

    String[] boys = new String[]{"Krish", "Manoj", "Charan", "Sai"};
    String[] girls = new String[]{"Tanvi", "Aaadya", "Dhatri", "Anusha"};

    String[] names = new String[boys.length + girls.length];

//    for(int i=0;i<boys.length;i++){
//        names[i] = boys[i];
//    }
//    for(int i=0;i<girls.length;i++){
//        names[boys.length+i] = girls[i];
//    }

    System.arraycopy(girls, 0, names, 0, girls.length);
    System.arraycopy(boys, 0, names, girls.length, boys.length);
    System.out.println(Arrays.toString(names));
    System.out.println(isAnagram(new int[]{1, 2, 3, 6, 5, 4}, new int[]{1, 2, 3, 5, 6, 4}));
  }

  // [10,20,50,30,40] [10,20,40,50,30]
  private static boolean isAnagram(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }

}
