package com.careerit.lef;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.List;
import java.util.Map;

public class YamlExamples {

    public static void main(String[] args) {
        String courses = "\n- Java\n- Python\n- DS\n- ML\n- AI";
        System.out.println(courses);

        LoaderOptions options = new LoaderOptions();
        Yaml yaml = new Yaml(options);
        List<String> list =  yaml.load(courses);
        list.forEach(System.out::println);

        // Reading map

        String student = "\n- name: Manoj\n  age: 30\n  email: monoj.pvn@gmail.com\n- name: Rajesh\n  age: 33\n  email: rajesh.t@gmail.com";
        System.out.println(student);
        List<Map<String,Object>> usersList = yaml.load(student);
        usersList.forEach(ele->{
            System.out.println(ele.get("name"));
        });
    }
}
