package problemsolving;

public class IntegerToBinary {

	public static void main(String[] args) {
		int number = 25;
		System.out.println("Recursive:::" + convertIntegerToBinaryRecursive(number));
		System.out.println("Loop::::::::" + convertIntegerToBinaryLoop(number));
	}

	private static int convertIntegerToBinaryRecursive(int number) {
		if (number == 1 || number == 0) {
			return number;
		}
		
		return number % 2 + 10 * (convertIntegerToBinaryRecursive(number / 2));
	}

	private static String convertIntegerToBinaryLoop(int number) {
		StringBuilder sb = new StringBuilder();
		
		while (!(number == 0)) {
			sb.append(number % 2);
			number = number / 2;
		}
		
		return sb.reverse().toString();
		
	}
}
