package practical_works.prac_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectEmail {
    public static void main(String[] args) {
        System.out.println("Enter your email >>>");

        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.]+@[A-Za-z0-9.]+$");

        while (true) {
            Scanner in = new Scanner(System.in);
            String password = in.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("Correct email");
                break;
            } else {
                System.out.println("Incorrect email");

            }
        }
    }
}
