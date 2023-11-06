package practical_works.prac_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectDate {
    public static void main(String[] args) {
        System.out.println("Enter any existing date from 1900 to 9999 in format\ndd/mm/yyyy ->");

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$");

        while (true){
            Scanner in = new Scanner(System.in);
            String password = in.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("This date exists");
                break;
            } else{
                System.out.println("Date doesn't exist or it's incorrect.\nTry again.");

            }
        }
    }
}
