package com.careerit.jsf.cj.basics.day23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Krish", "Manoj", "Charan", "Manoj", "Rajani", "Manoj"));
        names.sort(Comparator.comparing(String::toString).reversed());
        System.out.println(names);

    }

}
