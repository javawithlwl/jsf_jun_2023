package com.careerit.lef;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class ReadingContactInformation {

    public static void main(String[] args) {

        LoaderOptions options = new LoaderOptions();
        Constructor constructor = new Constructor(Contact.class,options);
        Yaml yaml = new Yaml(constructor);
        Iterable<Object> ret = yaml.loadAll(ReadingContactInformation.class.getResourceAsStream("/application.yaml"));
        for(Object obj:ret){
            if(obj instanceof Contact contact) {
                System.out.println(contact.getName() + " " + contact.getEmail() + " " + contact.getMobile());
            }
        }
    }
}
