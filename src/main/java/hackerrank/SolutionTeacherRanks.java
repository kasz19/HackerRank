package hackerrank;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;




public class SolutionTeacherRanks {
	

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	
    	if(grades == null || grades.isEmpty()) {
    		return grades;
    	}
    	
    	List<Integer> res = new ArrayList<Integer>();
    	
    	for(int grade : grades) {
    		if(grade < 38 || grade % 5 == 0) {
    			res.add(grade);
    		}else {
    			int nextMultiple = getNextMultiple(grade);
    			res.add(nextMultiple);
    		}
    	}
    	
    	return res;
    	
    }

	private static int getNextMultiple(int grade) {
		int mod = grade % 5;
		
		if(mod < 3) {
			return grade;
		}else {
			int res = grade;
			while(mod != 0) {
				res++;
				mod = res % 5;
			}
			return res;
		}
		
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
