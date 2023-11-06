package practical_works.prac_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectPassword {
    public static void main(String[] args) {
        System.out.println("Enter password, which length is bigger than 7 symbols and which is compiled from latin " +
                "letters,\nnumbers and '_'. The password must contain at least one capital and one undercase letter " +
                "and one number");

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9_]{8,}$");

        while (true) {
            Scanner in = new Scanner(System.in);
            String password = in.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("This password is secure.");
                break;
            } else {
                System.out.println("Try again, this password is insecure.");

            }
        }
    }
}
