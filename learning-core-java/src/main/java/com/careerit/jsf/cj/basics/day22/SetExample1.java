package com.careerit.jsf.cj.basics.day22;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample1 {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = List.of(3, 4, 5, 6,1,2,3,4,5,6,7,8,9,10);

        Set<Integer> numSet = new HashSet<>(list1);
        numSet.addAll(list2);
        System.out.println(numSet);

    }
}
