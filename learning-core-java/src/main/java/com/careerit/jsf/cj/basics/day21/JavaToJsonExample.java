package com.careerit.jsf.cj.basics.day21;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
class Product{
    private int pid;
    @JsonProperty("productName")
    private String name;
    private double price;
}
public class JavaToJsonExample {

    public static void main(String[] args) throws JsonProcessingException {

        String str = """
                {
                    "pid":1001,
                    "productName":"Dell Laptop",
                    "price":45000.00
                }""";

        ObjectMapper objectMapper = new ObjectMapper();
        Product product = objectMapper.readValue(str,Product.class);
        System.out.println(product);

        String jsonStr = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
        System.out.println(jsonStr);
    }
}
