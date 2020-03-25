package problemsolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrintStaircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        int numberOfSteps = 1;
        while(n >= numberOfSteps) {
            int spaces = n - numberOfSteps;
            while(spaces-- > 0) System.out.print(" ");
            int i=0;
            while(i++ < numberOfSteps) System.out.print("#");
            numberOfSteps++;
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
