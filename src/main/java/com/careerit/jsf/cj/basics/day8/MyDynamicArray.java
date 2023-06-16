package com.careerit.jsf.cj.basics.day8;

import java.util.Scanner;

public class MyDynamicArray {

  public static void main(String[] args) {

    int[] arr = new int[3];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    for (; ; ) {
      System.out.println("1. Add 2. Delete 3. Search 4. Update 5. Display 6. Exit");
      System.out.println("Enter your choice :");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println("Enter the element to add :");
          int ele = sc.nextInt();
          if (count < arr.length) {
            arr[count++] = ele;
          } else {
            int[] temp = new int[arr.length + 3];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            temp[count++] = ele;
            arr = temp;
          }
          break;
        case 2:
          System.out.println("Enter the element to delete :");
          int delEle = sc.nextInt();
          int index = -1;
          for (int i = 0; i < count; i++) {
            if (arr[i] == delEle) {
              index = i;
              break;
            }
          }
          if (index != -1) {
            for (int i = index; i < count - 1; i++) {
              arr[i] = arr[i + 1];
            }
            count--;
          } else {
            System.out.println("Element not found");
          }
          break;
        case 3:
          System.out.println("Enter the element to search :");
          int searchEle = sc.nextInt();
          boolean found = false;
          for (int i = 0; i < count; i++) {
            if (arr[i] == searchEle) {
              found = true;
              break;
            }
          }
          if (found) {
            System.out.println("Element found");
          } else {
            System.out.println("Element not found");
          }
          break;
        case 4:
          System.out.println("Enter the element to update :");
          int updateEle = sc.nextInt();
          System.out.println("Enter the new element :");
          int newEle = sc.nextInt();
          for (int i = 0; i < count; i++) {
            if (arr[i] == updateEle) {
              arr[i] = newEle;
              break;
            }
          }
          break;
        case 5:
          for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
          }
          System.out.println();
          break;
        case 6:
          System.out.println("Thanks for using the app");
          System.exit(0);
          break;
      }
    }
  }

}
