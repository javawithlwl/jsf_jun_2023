package com.careerit.jsf.cj.basics.interviewquestions;

public class PatternMatching {

    public static void main(String[] args) {

        var obj = getValue();
        var res = switch (obj) {
            case null -> {
                System.out.println("Please provide valid input");
                yield  "Input is null";
            }
            case String s -> {
                System.out.println("Input is string");
                System.out.println(s);
                yield  s.toUpperCase();
            }
            case Integer i -> i * i;
            case Double d -> d * d;
            default -> "Not matched";
        };
        System.out.println(res);
    }

    public static Object getValue() {
        return 10;
    }
}
