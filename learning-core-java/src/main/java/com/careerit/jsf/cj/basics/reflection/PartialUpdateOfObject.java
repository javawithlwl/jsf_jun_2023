package com.careerit.jsf.cj.basics.reflection;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.ToString;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
class Product{
    private long pid;
    private String pname;
    private double price;
    private String brand;
    private String category;
}
public class PartialUpdateOfObject {

    public static void main(String[] args) {
        Product product = new Product();
        product.setPid(1001);
        product.setPname("Dell Laptop");
        product.setPrice(45000);
        product.setBrand("Dell");
        product.setCategory("Electronics");
        System.out.println(product);

        // Update the price of the product to 50000
        // Update the brand to HP

        Map<String,Object> map = new HashMap<>();
        map.put("price",50000);
        map.put("brand","HP");

        Product updatedProduct = updateObject(product,map);
        System.out.println(updatedProduct);

    }
    @SneakyThrows
    private static <T> T updateObject(T obj,Map<String,Object> map){
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field filed:fields){
            filed.setAccessible(true);
            if(map.containsKey(filed.getName())){
                filed.set(obj,map.get(filed.getName()));
            }
        }
        return obj;
    }
}
