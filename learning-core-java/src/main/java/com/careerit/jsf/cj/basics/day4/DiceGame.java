package com.careerit.jsf.cj.basics.day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

  public static void main(String[] args) {

    int generatedNumber = ThreadLocalRandom.current().nextInt(1, 7);
    for (int i = 1; i <= 3; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the guessed number (1-6): ");
      int guessedNumber = sc.nextInt();
      if (guessedNumber == generatedNumber) {
        System.out.println("You guessed the number in " + i + " attempt(s), you won the game");
        break;
      } else {
        if (i == 3) {
          System.out.println("You have reached max number of attempts, the generated number is :" + generatedNumber + " you lost the game");
        } else {
          System.out.println("Sorry! it is wrong guess try again");
        }
      }
    }
  }

}
