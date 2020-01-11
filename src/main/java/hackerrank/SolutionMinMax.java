package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionMinMax {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	long maxSum = 0;
    	long minSum = Long.MAX_VALUE;
    	
    	for(int i = 0; i < arr.length; i++) {
    		
    		long sum = getSum(i, arr);
    		if(sum > maxSum) {
    			maxSum = sum;
    		}
    		if(sum < minSum) {
    			minSum = sum;
    		}
    		
    	}
    	
    	System.out.println(minSum + " " + maxSum);

    }

    private static long getSum(int index, int[] arr) {
    	long res = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(index == i) {
    			continue;
    		}
    		res += arr[i];
    	}
    	return res;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
