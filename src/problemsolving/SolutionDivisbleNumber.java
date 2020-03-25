package problemsolving;
import java.util.Scanner;

public class SolutionDivisbleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factor = sc.nextInt();
		boolean divisible = isDivisibleBy(number, factor);
		System.out.println(number + " is divisible by " + factor + " : " + divisible);
	}

	private static boolean isDivisibleBy(int number, int factor) {
		if(number == factor) return true;
		if(number<factor) return false;
		
		while (number > 0)
			number = number - factor;

		return (number == 0) ? true : false;

	}
}