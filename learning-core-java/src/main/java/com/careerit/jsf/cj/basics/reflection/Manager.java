package com.careerit.jsf.cj.basics.reflection;

import java.io.Serializable;
import java.lang.reflect.Method;

class C1 implements Serializable, Cloneable{
    private void m1(){

    }
    public void m2(){

    }
}
public class Manager {
    public static void main(String[] args) {
        Method[] methods = C1.class.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
        Class<? super C1> cls = C1.class.getSuperclass();
        System.out.println(cls);
        Class<?>[] clsArr = C1.class.getInterfaces();
        for(Class<?> c:clsArr){
            System.out.println(c);
        }
    }
}
