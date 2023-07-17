package com.careerit.lef;

import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFiles {
    private static Properties properties = null;

    public static void main(String[] args) {
        System.out.println(getProperty("app.name"));
        System.out.println(getProperty("db.url"));
    }

    public static String getProperty(String propertyName) {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(ReadingPropertyFiles.class.getResourceAsStream("/db.properties"));
                properties.load(ReadingPropertyFiles.class.getResourceAsStream("/application.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return properties.getProperty(propertyName);
    }
}
