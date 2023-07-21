package com.careerit.junit5.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringOperationsTest {

        StringOperations obj;

        @BeforeEach
        public void init(){
            obj = new StringOperations();
        }
        @Test
        public void isPalindrome(){
            String str = "ABC";
            boolean actual = obj.isPalindrome(str);
            boolean expected = false;
            assertFalse(actual);
        }
        @Test
        public void isPalindromeForNull(){
            String str = null;
            boolean actual = obj.isPalindrome(str);
            boolean expected = false;
            assertFalse(actual);
        }
        @Test
        public void isPalindromeForEmpty(){
            String str = "";
            boolean actual = obj.isPalindrome(str);
            boolean expected = false;
            assertFalse(actual);
        }
        @Test
        @Timeout(value = 6,unit = TimeUnit.MILLISECONDS)
        public void isPalindromeForSingleChar(){
            String str = "A";
            boolean actual = obj.isPalindrome(str);
            boolean expected = true;
            assertTrue(actual);
        }
        @Test
        public void isPalindromeWithPalindrome(){
            String str = "ABBA";
            boolean actual = obj.isPalindrome(str);
            boolean expected = true;
            assertTrue(actual);
        }
}
