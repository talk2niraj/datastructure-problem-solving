package problemsolving;
import java.util.Scanner;

public class OneEdit {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		
		if(isOneChange(first, second)) {
			System.out.println("One change");
		} else {
			System.out.println("Not one change");
		}
	}

	static boolean isOneChange(String first, String second) {
		if (first == null || second == null) return false;
		int editCount = 0;
		int i=0, j=0;

		while (i<first.length() && j<second.length()) {
			if (first.charAt(i) != second.charAt(j)) {
				if(editCount == 1) {
					return false;
				}
				if(first.length()>second.length()) {
					i++;
				} else if (first.length()<second.length()) {
					j++;
				} else {
					i++;
					j++;
				}
				editCount++;
			} else {
				i++;
				j++;
			}
		}
		
		if (i<first.length() || j<second.length()) {
			editCount++;
		}
		
		return editCount == 1;
	}
}