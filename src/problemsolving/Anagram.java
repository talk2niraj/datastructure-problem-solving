package anagram;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "LISTEN";
        String str2 = "SILENT";
        System.out.println(str1 + " and " + str2 + " are anagram: " + areAnagram(str1, str2)); //anagram

        str1 = "POP";
        str2 = "POT";
        System.out.println(str1 + " and " + str2 + " are anagram: " + areAnagram(str1, str2)); //not anagram

        str1 = "Power";
        str2 = "history";
        System.out.println(str1 + " and " + str2 + " are anagram: " + areAnagram(str1, str2)); //not anagram

        str1 = "fried";
        str2 = "fired";
        System.out.println(str1 + " and " + str2 + " are anagram: " + areAnagram(str1, str2)); //anagram
    }

    private static boolean areAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        int count[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)] = count[str1.charAt(i)] + 1;
            count[str2.charAt(i)] = count[str2.charAt(i)] - 1;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (count[str1.charAt(i)] != 0) {
                return false;
            }
        }

        return true;
    }
}
