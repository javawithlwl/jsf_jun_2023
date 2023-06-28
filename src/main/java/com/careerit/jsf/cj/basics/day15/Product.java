package com.careerit.jsf.cj.basics.day15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

@Getter
@Setter
@AllArgsConstructor
public class Product{

    private int pid;
    private String name;
    private double price;

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
            .add("pid=" + pid)
            .add("name='" + name + "'")
            .add("price=" + price)
            .toString();
    }
}
