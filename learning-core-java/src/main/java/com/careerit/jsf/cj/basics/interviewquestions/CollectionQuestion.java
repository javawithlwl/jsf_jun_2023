package com.careerit.jsf.cj.basics.interviewquestions;

import java.util.List;
import java.util.Map;

public class CollectionQuestion {

        public static List<String> getUniqueNames(List<String> names){
            return null;
        }
        private static Map<String,Integer> getNameAndLength(List<String> names){
            return null;
        }
        // abc@lwl.com,anand@lwl.com,abc@careerit.com,xyz@careerit.com,pqr@careerit.com,abc@hello.io
        // {"com":
        //        {"lwl":[abc,anand],"careerit":[abc,xyz,pqr]},
        // "io":{"hello":[abc]}
        private static Map<String,Map<String,List<String>>> getGroupByDomain(List<String> emails){
            return null;
        }
}
