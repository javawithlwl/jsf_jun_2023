package com.careerit.jsf.cj.basics.reflection;


import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@interface MyAnnotation {

    String name();

    String version();
}

@MyAnnotation(version = "1.0", name = "One")
class One {

    @Override
    public String toString() {
        return "One";
    }
}

public class AnnotationExample {

    public static void main(String[] args) {

        One obj = new One();
        System.out.println(obj);
        Annotation[] arr = obj.getClass().getAnnotations();

        for (Annotation a : arr) {
            if (a instanceof MyAnnotation ma) {
                System.out.println(ma.name());
                System.out.println(ma.version());
            }
        }
    }

}
