package problemsolving;

public class SingleMissingNumberInIntegerArray {
	
	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 6};
		int totalCount = 6;
		
		System.out.println(findMissingNumberInIntArray(array, totalCount));
	}

	private static int findMissingNumberInIntArray(int[] array, int totalCount) {

		if (array == null || array.length == 0) return 0;
		
		int expectedSum = totalCount * (totalCount + 1) / 2;
		int actualSum = 0;
		
		for (int i=0; i<array.length; i++) {
			actualSum += array[i];
		}
		
		return expectedSum - actualSum;
	}

}
