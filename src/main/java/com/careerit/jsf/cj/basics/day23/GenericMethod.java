package com.careerit.jsf.cj.basics.day23;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Player {
    private String name;
    private String country;
}

@Data
class User {
    private String name;
    private int age;
    private String city;
}

@Data
class ProductItem {
    private String name;
    private String model;
    private double price;

}

class One {

}

class Two extends One {

}

class Three extends Two {

}

public class GenericMethod {

    public static void main(String[] args) {
//        Player obj = readObject(Player.class, "/player.json");
//        System.out.println(obj);
//
//        User user = readObject(User.class, "/user.json");
//        System.out.println(user);

        String[] arr = {"1", "2", "3", "4", "5"};
        Double[] numArr = {1.0, 2.0, 3.0};
        fromArrayList(numArr);
        List<Two> two = new ArrayList<>();
        List<Three> three = new ArrayList<>();
        List<One> one = new ArrayList<>();
        m1(one);

    }

    public static <T> T readObject(Class<T> cls, String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(GenericMethod.class.getResource(fileName), cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Something went wrong while reading the file");
    }

    public static <T extends Number> List<T> fromArrayList(T[] arr) {
        return List.of(arr);
    }

    public static <T extends Number & Comparable<T>> List<T> fromArrayLists(T[] arr) {
        return List.of(arr);
    }

    public static void m1(List<? super Two> list) {

    }


}
