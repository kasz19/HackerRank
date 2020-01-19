package hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SolutionTimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */

		if (s == null || s.trim().length() == 0) {
			return s;
		}
		
		if (s.startsWith("12") && s.endsWith("AM")) {
			return s.replace("AM", "").replace("12", "00");
		}
		else if (s.startsWith("12") && s.endsWith("PM")) {
			return s.replace("PM", "");
		}
		else if (s.endsWith("AM")) {
			return s.replace("AM", "");
		}

		int hours = Integer.parseInt(s.substring(0, 2));

		hours = hours + 12;

		s = s.substring(2).replace("PM", "");

		s = hours + s;

		return s;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		String s = "07:05:45AM";
		String result = timeConversion(s);

		System.out.println(result);
	}
}
