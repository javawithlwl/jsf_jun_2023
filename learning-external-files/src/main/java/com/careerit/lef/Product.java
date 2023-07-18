package com.careerit.lef;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {
    @JsonProperty("id")
    private String pid;
    @JsonProperty("name")
    private String productName;
    private double price;
    private String description;
    private String category;
}
