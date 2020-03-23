package problemsolving;

//Hit compile and run to see a sample output.
//Read values from stdin, do NOT hard code input.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ApplePuzzle {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNumberOfApples = Integer.parseInt(br.readLine());
        int giaNumberOfMoreApples = Integer.parseInt(br.readLine());

        if (totalNumberOfApples >= giaNumberOfMoreApples) {
           //Maddie has total - number of more apple gia has / 2
            int numberOfAppleBelongsToMaddie = Math.abs((totalNumberOfApples - giaNumberOfMoreApples) / 2);

            int numberOfAppleBelongsToGia = totalNumberOfApples - numberOfAppleBelongsToMaddie;

            System.out.println(numberOfAppleBelongsToGia);
            System.out.println(numberOfAppleBelongsToMaddie);
        } else {
            throw new Exception("Invalid input");
        }
       
    }
}