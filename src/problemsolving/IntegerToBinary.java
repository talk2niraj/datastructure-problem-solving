package problemsolving;

public class IntegerToBinary {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(convertIntegerToBinary(number));
	}

	private static int convertIntegerToBinary(int number) {
		if (number == 1 || number == 0) {
			return number;
		}
		
		return number % 2 + 10 * (convertIntegerToBinary(number / 2));
	}
}
