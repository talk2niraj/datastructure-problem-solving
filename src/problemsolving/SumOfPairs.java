package problemsolving;

public class SumOfPairs {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 4};
		
		System.out.println(sumOfPairs(arr));
		System.out.println(sumOfPairsOptimized(arr));
	}

	private static int sumOfPairs(int[] arr) {
		
		int sum = 0;
		
		if (arr != null && arr.length > 0) {
			for (int i=0; i < arr.length; i++) {
				for (int j=0; j < arr.length; j++) {
					sum += arr[i] + arr[j];
				}
			}
		}
		return sum;
	}
	
private static int sumOfPairsOptimized(int[] arr) {
		
		int sum = 0;
		
		if (arr != null && arr.length > 0) {
			for (int i=0; i < arr.length; i++) {
				sum += arr[i] * (2 * arr.length);
			}
		}
		return sum;
	}

}
