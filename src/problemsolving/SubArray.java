package problemsolving;

public class SubArray {

	public static void main(String[] args) {
		int arr[] = { 6, 1, 4, 20, 3, 5, 10 };
		int sum = 23;

		printSubArrayIndexes(arr, sum);
	}

	private static boolean printSubArrayIndexes(int[] arr, int sum) {

		int currentSum = arr[0];
		int startIndex = 0;

		for (int i = 1; i <= arr.length; i++) {

			while (currentSum > sum && startIndex < i-1) {
				currentSum = currentSum - arr[startIndex];
				startIndex++;
			} 
			
			if (currentSum == sum) {
				int endIndex = i -1;
				System.out.println("Found between "+startIndex + " and " + endIndex);
				return true;
			}
			
			if (i < arr.length) {
				currentSum = currentSum + arr[i];
			}
			
		}
		
		System.out.println("Not found");
		return false;
	}
}
