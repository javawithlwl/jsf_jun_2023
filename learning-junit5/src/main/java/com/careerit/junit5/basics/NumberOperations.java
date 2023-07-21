package com.careerit.junit5.basics;

import static java.lang.Math.max;

public class NumberOperations {

    public int biggest(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int divide(int a,int b) {
    	if(b == 0) {
    		throw new IllegalArgumentException("Denominator should not be zero");
    	}
    	return a/b;
    }

}
