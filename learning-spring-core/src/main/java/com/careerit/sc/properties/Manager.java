package com.careerit.sc.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySources;

@ComponentScan(basePackages = "com.careerit.sc.properties")
@PropertySources(value = {
        @org.springframework.context.annotation.PropertySource("classpath:db.properties"),
        @org.springframework.context.annotation.PropertySource("classpath:app.properties")
})
public class Manager {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        DbConnection dbConnection = context.getBean(DbConnection.class);
        System.out.println(dbConnection);
        dbConnection.showEnvironmentVariables();
    }


}
