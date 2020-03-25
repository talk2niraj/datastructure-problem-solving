package problemsolving;
import java.util.Scanner;

public class SolutionEditChar {

	static boolean isEditCharacterOne(String str1, String str2) {
		int  m =str1.length(), n = str2.length();
		int count = 0,i=0,j=0;
		if(Math.abs(m-n) > 1)
			return false;

		while(i < m && j < n) {
			
			if(str1.charAt(i) != str2.charAt(j)) {
				if(count ==1)
					return false;
				if(m > n) {
					i++;
				} else if (m < n) {
					j++;
				} else {
					i++;
					j++;
				}
				count++;
			} else {
				i++;
				j++;
			}
		}
		if(i<m || j< n) {
			count++;
		}
		return count==1;
	}
	

	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine(); 
		String str2 = sc.nextLine();
		if(isEditCharacterOne(str1, str2)) 
			System.out.print("Yes they are one edit......"); 
		else
			System.out.print("No they are not one edit......");  
	}	 
}