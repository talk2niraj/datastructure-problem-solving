package problemsolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwap {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int counter = 1;
		int swapCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if(counter == arr[i]) {
				counter++;
				continue;
			}
			for (int j = i; j < arr.length; j++)
				if (arr[j] != counter) {
					continue;
				} else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapCount++;
				}
			counter++;
		}
		return swapCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = minimumSwaps(arr);
		System.out.println(res);
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();

//        busfferedWriter.close();

		scanner.close();
	}
}
