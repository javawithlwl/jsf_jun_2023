package com.careerit.junit5.basics;

import java.util.concurrent.TimeUnit;

public class StringOperations {


        public boolean isPalindrome(String str){
            try {
                TimeUnit.MICROSECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(str == null || str.isEmpty()){
                return false;
            }
            String rev = new StringBuilder(str).reverse().toString();
            return str.equals(rev);
        }
}
