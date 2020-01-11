package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionStaircase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	
    	if(n == 0) {
    		System.out.println("#");
    	}
    	
    	String nWhites = "";
    	String nDash = "";
    	for(int i = 1; i <= n; i++) {
    		nWhites += " ";
    	}
    	
    	for(int i = 1; i <= n; i++) {
    		nWhites = nWhites.substring(0, nWhites.length() - 1);
    		nDash = nDash + "#";
    		System.out.println(nWhites + nDash);
    	}
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 6;

        staircase(n);

        scanner.close();
    }
}
