package com.careerit.jsf.cj.basics.day17;

import java.util.Scanner;

abstract class Game {
  public Game() {
    System.out.println("Game constructor");
  }
  public void start() {
    System.out.println("The game " + this.getClass().getSimpleName() + " is started");
  }

  abstract public void play();

  public void stop() {
    System.out.println("The game " + this.getClass().getSimpleName() + " is stopped");
  }
}

class Bike extends Game {
  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + ", please wear helmet");
  }
}

class Car extends Game {
  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + ", please wear seat belt");
  }
}

class Ship extends Game {
  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + ", please wear life jacket");
  }
}

public class AbstractClassExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Bike 2. Ship 3. Car 4. Exit");
    System.out.println("Enter your choice :");
    int ch = sc.nextInt();
    Game game = getGame(ch);
    game.start();
    game.play();
    game.stop();
    sc.close();
  }

  private static Game getGame(int ch) {
    return switch (ch) {
      case 1 -> new Bike();
      case 2 -> new Ship();
      case 3 -> new Car();
      default -> throw new IllegalArgumentException("Invalid choice");
    };
  }

}
