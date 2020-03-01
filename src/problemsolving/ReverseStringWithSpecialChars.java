package problemsolving;

public class ReverseStringWithSpecialChars {

	public static void main(String[] args) {
		String str = "Ab,c,de!$";
		System.out.println("Input string:::::"+str);
		System.out.print("Reverse string:::");
		for (char c : reverse(str)) {
			System.out.print(c);
		}
	}

	private static char[] reverse(String str) {
		char[] strChars = str.toCharArray();
		
		int inboundIndex=0;
		int outboundIndex=strChars.length-1;
		
		while(inboundIndex < outboundIndex) {
			if (!Character.isAlphabetic(strChars[inboundIndex])) {
				inboundIndex++;
			}
			if (!Character.isAlphabetic(strChars[outboundIndex])) {
				outboundIndex--;
			}
			if (Character.isAlphabetic(strChars[inboundIndex]) && Character.isAlphabetic(strChars[outboundIndex])) {
				char temp = strChars[inboundIndex];
				strChars[inboundIndex] = strChars[outboundIndex];
				strChars[outboundIndex] = temp;
				inboundIndex++;
				outboundIndex--;
			}
			
		}
		
		return strChars;
	}
}
