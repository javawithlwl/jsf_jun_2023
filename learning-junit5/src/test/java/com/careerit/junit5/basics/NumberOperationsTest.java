package com.careerit.junit5.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOperationsTest {

    private NumberOperations obj;

    @BeforeEach
    public void init() {
        obj = new NumberOperations();
    }

    @Test
    void biggestAsAOfThreeNumbers() {
        int a = 40, b = 20, c = 30;
        int actual = obj.biggest(a, b, c);
        int expected = 40;
        assertEquals(expected, actual);
    }

    @Test
    void biggestAsBOfThreeNumbers() {
        int a = 40, b = 50, c = 30;
        int actual = obj.biggest(a, b, c);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    void biggestAsCOfThreeNumbers() {
        int a = 40, b = 20, c = 50;
        int actual = obj.biggest(a, b, c);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    void biggestAsEqualOfThreeNumbers() {
        int a = 40, b = 40, c = 40;
        int actual = obj.biggest(a, b, c);
        int expected = 40;
        assertEquals(expected, actual);
    }

    @Test
    void fibonacciOfZero() {
        int num = 0;
        int actual = obj.fibonacci(num);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void fibonacciOfOne() {
        int num = 1;
        int actual = obj.fibonacci(num);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Fibonacci of 10")
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Not supported on windows")
    void fibonacciOfTen() {
        int num = 10;
        int actual = obj.fibonacci(num);
        int expected = 55;
        assertEquals(expected, actual);
    }
    @Test
    void fibonacciOfEight() {
        int num = 8;
        int actual = obj.fibonacci(num);
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    void biggestTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 5, 9);
        int max = numbers.stream().mapToInt(e -> e).max().getAsInt();
        System.out.println("Max : " + max);
        assertEquals(9, max);
    }
    @Test
    void groupAssertionsTest(){
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    @Test
    void isPrimeWithPrime(){
        int num = 7;
        boolean actual = obj.isPrime(num);
        assertTrue(actual);
    }
    @Test
    void isPrimeWithTwo(){
        int num = 2;
        boolean actual = obj.isPrime(num);
        assertTrue(actual);
    }
    @Test
    void isPrimeWithOne(){
        int num = 1;
        boolean actual = obj.isPrime(num);
        assertFalse(actual);
    }
    @Test
    void isPrimeWithNonPrime(){
        int num = 10;
        boolean actual = obj.isPrime(num);
        assertFalse(actual);
    }

    @Test
    void divideWithValidInputs() {
    	int a = 10;
    	int b = 2;
    	int actual = obj.divide(a, b);
    	int expected = 5;
    	assertEquals(expected, actual);
    }
    @Test
    void divideWithException() {
    	int a = 10;
    	int b = 0;
    	assertThrows(IllegalArgumentException.class, () -> obj.divide(a, b));
    }



}
