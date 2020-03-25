package problemsolving;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ComputeGrade {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        int result[] = new int[grades.length];
        for(int i=0; i<grades.length; i++) {
            int rem = grades[i]%5; 
            int additionalMarks = (5 - rem);
            if(grades[i] + 2 >= 40 && additionalMarks < 3) {
                result[i] = grades[i] + additionalMarks;
            } else {
            	result[i] = grades[i];
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.print(result[resultItr]);

            if (resultItr != result.length - 1) {
                System.out.println();
            }
        }
    }
}
