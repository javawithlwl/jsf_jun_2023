package com.careerit.sc.properties;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Getter
@Setter
@ToString
@Component
public class DbConnection {

    @Value("${db.url}")
    private String url;
    @Value("${db.username:dbuser}")
    private String username;
    @Value("${db.password}")
    private String password;

    @Autowired
    private Environment env;

    public void showEnvironmentVariables(){
        Map<String, Object> map = new HashMap();
        for(Iterator it = ((AbstractEnvironment) env).getPropertySources().iterator(); it.hasNext(); ) {
            PropertySource propertySource = (PropertySource) it.next();
            if (propertySource instanceof MapPropertySource) {
                map.putAll(((MapPropertySource) propertySource).getSource());
            }
        }
        System.out.println(map);
    }
}
