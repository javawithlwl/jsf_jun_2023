package com.careerit.jsf.cj.basics.reflection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.ToString;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Map;

@Getter
@Setter
@ToString
class Employee {
    private int empno;
    private String ename;
    private String job;
    private float salary;
}

public class ObjectCreationUsingReflection {

    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(ObjectCreationUsingReflection.class
                .getResource("/employee.json"), new TypeReference<Employee>() {
        });
        System.out.println(employee);

    }

    @SneakyThrows
    private static <T> T createObject(Class<T> cls, Map<String, Object> map) {
        Constructor constructor = cls.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        T obj = (T) constructor.newInstance();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            f.set(obj, map.get(f.getName()));
        }
        return obj;
    }

}
