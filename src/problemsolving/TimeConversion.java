package problemsolving;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String formattedTime = s.substring(0, s.length() -2);
        if(s.indexOf("PM") > 0 && Integer.parseInt(formattedTime.split(":")[0]) != 12) {
           formattedTime = formattedTime.replace(formattedTime.split(":")[0], ""+(Integer.parseInt(formattedTime.split(":")[0]) + 12));
        } else if(s.indexOf("AM") > 0 && Integer.parseInt(formattedTime.split(":")[0]) == 12) formattedTime = formattedTime.replace(formattedTime.split(":")[0], "00");
     
        return formattedTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scan.nextLine();

        String result = timeConversion(s);
        
        System.out.println(result);

    }
}
