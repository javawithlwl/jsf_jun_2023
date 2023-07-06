package com.careerit.jsf.cj.basics.day21;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.function.Predicate;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> nameList1 = List.of("Tanvi", "Aadya", "Dhatri", "Krish", "Manoj", "Charan");
        List<String> namesList2 = List.of("Krish", "Manoj", "Charan", "Rajesh", "Rakesh");

        Set<String> set = new HashSet<>();
        set.addAll(nameList1);
        set.addAll(namesList2);

        System.out.println(set);

        Collection<String> names = CollectionUtils.union(nameList1, namesList2);
        System.out.println(names);

    }

    private List<Integer> getEvenNumbers(List<Integer> list){
//        List<Integer> evenList = new ArrayList<>();
//        for(int ele:list){
//            if(ele % 2 == 0){
//                evenList.add(ele);
//            }
//        }
//        return evenList;
        return list.stream()
                .filter((ele)->ele % 2 == 0)
                .toList();
    }
    private List<Integer> getNumbersDivisibleByThreeAndDoubleIt(List<Integer> list){
//        List<Integer> tempList = new ArrayList<>();
//        for(int ele:list){
//            if(ele % 3 == 0){
//                tempList.add(ele * 2);
//            }
//        }
//        return tempList;

        return list.stream()
                .filter((ele)->ele % 3 == 0)
                .map((ele)->ele * 2)
                .toList();

    }

    private List<Integer> getLengthNames(List<String> list){
//            List<Integer> tempList = new ArrayList<>();
//            for(String ele:list){
//                tempList.add(ele.length());
//            }
//            return tempList;

        return list
                .stream()
                .map(String::length)
                .toList();

    }

    private List<String> getNamesStartsWithConvertIntoUpperCase(List<String> list,String prefix){
//            List<String> tempList = new ArrayList<>();
//            for(String ele:list){
//                if(ele.toUpperCase().startsWith(prefix.toUpperCase()) && isPalindrome(ele)){
//                    tempList.add(ele.toUpperCase());
//                }
//            }
//            return tempList;
           return  list.stream()
                     .filter((ele)->ele.toUpperCase().startsWith(prefix.toUpperCase()) && isPalindrome(ele))
                     .map(String::toUpperCase)
                     .toList();

    }

    private boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
