package com.careerit.jsf.cj.basics.day22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Krish", 1001);
        map.put("Manoj", 1002);
        map.put("Charan", 1003);
        map.put("Manoj", 1004);

        System.out.println(map);
        System.out.println(map.get("Manoj"));

        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);

        for(String key:keys) {
        	System.out.println(key+" : "+map.get(key));
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String, Integer> entry:entrySet) {
        	System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        map.putIfAbsent("Rajani", 1005);
        map.putIfAbsent("Manoj", 1006);
        System.out.println(map);
    }
}
