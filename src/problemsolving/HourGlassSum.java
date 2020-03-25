package problemsolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int highestSum=-1000000000;
        for (int rowIndex=0; rowIndex<6; rowIndex++) {
        	if(rowIndex > 3) break;
            for (int colIndex=0; colIndex<6; colIndex++) {
                if(colIndex > 3) break;
                System.out.println(arr[rowIndex][colIndex] + " " + arr[rowIndex][colIndex+1] + " " + arr[rowIndex][colIndex+2]);
                System.out.println("  "+arr[rowIndex+1][colIndex+1]);
                System.out.println(arr[rowIndex+2][colIndex] + " " + arr[rowIndex+2][colIndex+1] + " " + arr[rowIndex+2][colIndex+2]);
                int sum = arr[rowIndex][colIndex] + arr[rowIndex][colIndex+1] + arr[rowIndex][colIndex+2]
                		+arr[rowIndex+1][colIndex+1]
                				+arr[rowIndex+2][colIndex] + arr[rowIndex+2][colIndex+1] + arr[rowIndex+2][colIndex+2];
                System.out.println("sum->"+sum);
                highestSum = highestSum < sum ? sum : highestSum;

            }
        }
        return highestSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
