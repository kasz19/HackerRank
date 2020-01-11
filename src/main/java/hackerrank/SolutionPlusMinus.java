package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionPlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	
    	long len = arr.length;
    	long nZeros = 0;
    	long nPos = 0;
    	long nNeg = 0;
    	
    	
    	for(int i = 0; i < len; i++) {
    		
    		if(arr[i] < 0) {
    			nNeg = nNeg + 1;
    		}
    		else if(arr[i] > 0) {
    			nPos = nPos + 1;
    		}
    		else {
    			nZeros = nZeros + 1;
    		}
    	}
    	
    	DecimalFormat df = new DecimalFormat("#.######");
    	df.setRoundingMode(RoundingMode.CEILING);
    	
    	System.out.println(nPos != 0 ? df.format(nPos / len) : df.format(0));
    	System.out.println(nNeg != 0 ? df.format(nNeg / len) : df.format(0));
    	System.out.println(nZeros != 0 ? df.format(nZeros / len) : df.format(0));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
