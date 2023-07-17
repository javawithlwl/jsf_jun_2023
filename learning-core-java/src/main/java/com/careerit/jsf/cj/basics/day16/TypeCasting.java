package com.careerit.jsf.cj.basics.day16;

import java.util.ArrayList;
import java.util.List;

class Animal {
  void sound() {
    System.out.println("Animal sound");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog sound");
  }
}

class Cat extends Animal {
  void sound() {
    System.out.println("Cat sound");
  }

  void jump() {
    System.out.println("Cat jump");
  }
}

class Lion extends Animal {
  void sound() {
    System.out.println("Lion sound");
  }
}

public class TypeCasting {

  public static void main(String[] args) {

    List<Animal> list = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      list.add(getAnimal());
    }
    // get count of lions in the list
    int lionCount = 0;
    for (Animal animal : list) {
      if (animal instanceof Lion) {
        lionCount++;
      }
    }
    System.out.println("Total number of lions :" + lionCount);

  }

  private static Animal getAnimal() {
    int num = (int) (Math.random() * 4) + 1;
    Animal animal = switch (num) {
      case 1 -> new Dog();
      case 2 -> new Cat();
      case 4 -> new Lion();
      default -> new Animal();
    };
    return animal;
  }
}
