package com.careerit.jsf.cj.basics.day23;

import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
class Product{
    private String name;
    private double price;

}
public class InterviewQuestion {

    public static void main(String[] args) {
        m3();

    }

    public static void m3(){
        Set<Product> set = new HashSet<>();
        set.add(new Product("Dell", 45000));
        set.add(new Product("Dell", 45000));
        set.add(new Product("Dell", 45000));
        set.add(new Product("Lenovo", 45000));
        System.out.println(set.size());
    }

    public static void m2(){
        Set<String> set = new HashSet<>();
        set.add("Manoj");
        set.add("Charan");
        set.add("Krish");
        set.add("Manoj");
        set.add(null);
        set.add(null);
        System.out.println(set.size());
    }

    public static void m1(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(101);
        list.add(102);
        list.add(1010);

        list.remove(2);
        list.remove(Integer.valueOf(101));
        System.out.println(list);
    }
}
