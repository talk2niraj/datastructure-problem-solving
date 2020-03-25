package problemsolving;
import java.util.Scanner;

public class PrintUniqueElements {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first array size:");
		int size = scanner.nextInt();
		int array1[] = new int[size];
		
		for(int i=0; i<size; i++) {
			array1[i] = scanner.nextInt();
		}
		
		System.out.print("Enter second array size:");
		size = scanner.nextInt();
		int array2[] = new int[size];
		
		for(int i=0; i<size; i++) {
			array2[i] = scanner.nextInt();
		}
		
		System.out.println("Output->");
		printUniqueElements(array1, array2);
	}
	
	static void printUniqueElements(int[]array1, int[]array2) {
		if(array1 == null || array2 == null || array1.length<1 || array2.length<1) return;
		
		int i = 0, j = 0;
		while(i<array1.length && j<array2.length) {
			if(array1[i] == array2[j]) {
				i++;
				j++;
			} else if (array1[i]<array2[j]) {
				System.out.print(array1[i] + " ");
				i++;
			} else {
				System.out.print(array2[i] + " ");
				j++;
			}
		}
		
		while(i<array1.length) System.out.print(array1[i++] + " ");
		
		while(j<array2.length) System.out.print(array2[j++] + " ");
	}

}