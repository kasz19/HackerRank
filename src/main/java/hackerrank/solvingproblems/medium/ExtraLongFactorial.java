package hackerrank.solvingproblems.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorial {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
    	
    	BigInteger res = getFactorialPrinted(n);
    	
    	System.out.println(res);

    }

    private static BigInteger getFactorialPrinted(int n) {
    	if(n == 0) {
    		return new BigInteger("1");
    	}
    	return getFactorialPrinted(n - 1).multiply(new BigInteger(n + ""));
		
	}

    public static void main(String[] args) {
        int n = 4;
        extraLongFactorials(n);
    }
}
