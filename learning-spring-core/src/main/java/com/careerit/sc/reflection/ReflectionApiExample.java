package com.careerit.sc.reflection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Getter
@Setter
@ToString
class One {
    private String name;
    private String email;
}

@Getter
@Setter
@ToString
class Two {
    private String name;
    private String email;
    private String mobile;
}

public class ReflectionApiExample {
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ReflectionApiExample.class.getClassLoader().getResourceAsStream("app.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Krish");
        map.put("email", "krish.t@gmail.com");
        map.put("mobile", "9876543210");
        String className = properties.getProperty("class.name");
        try {
            Class clazz = Class.forName(className);
            Object obj = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for(Field field:fields){
                    field.setAccessible(true);
                    field.set(obj,map.get(field.getName()));
            }
            System.out.println(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
