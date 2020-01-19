package hackerrank.solvingproblems.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encrypt {

    // Complete the encryption function below.
    static String encryption(String s) {

    	String sFormatted = s.replaceAll(" ", "");
    	
    	double resSqrt = Math.sqrt(sFormatted.length());
    	
    	int ceil = (int) resSqrt;
    	
    	int floor = resSqrt % 1 != 0 ? ceil + 1 : ceil;
    	
    	int i, j, index = 0;
    	
    	String [][] matrix;
    	
    	if(floor * ceil < sFormatted.length()) {
    		ceil = floor;
    	}
    	
    	matrix = new String[ceil][floor];
    	
    	for (i = 0; i < ceil; i++) {
    		for(j = 0; j < floor; j++) {
    			if(sFormatted.length() > index) {
	    			matrix[i][j] =  sFormatted.charAt(index) + "";
	    			index++;
    			}
    		}
    	}
    	
    	String resul = "";
    	
    	for(int r=0;r<matrix[0].length; r++) {
    		 for (int c=0; c < matrix.length; c++) {
    		    resul += matrix[c][r] != null ? matrix[c][r] : "";
    		}
    		resul += " ";
    	}
    	
    	System.out.println(resul);
    	
    	return resul;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
  
        String s = "iffactsdontfittotheorychangethefacts";

        String result = encryption(s);


        scanner.close();
    }
}
