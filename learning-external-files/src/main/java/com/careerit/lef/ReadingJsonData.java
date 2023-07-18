package com.careerit.lef;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ReadingJsonData {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {};
        try{
            List<Product> products = objectMapper
                    .readValue(ReadingJsonData.class.getResourceAsStream("/products.json"), typeReference);
            System.out.println("Total products :"+products.size());
            products.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
