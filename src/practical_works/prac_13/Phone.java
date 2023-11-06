package practical_works.prac_13;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        System.out.println("Input a phone number");

        Scanner in = new Scanner(System.in);
        String input_num = in.nextLine();

        System.out.println(phoneTransformer(input_num));
    }

    public static String phoneTransformer(String input_num) {
        String num_plus;
        String country_code = "";
        String number = "";

        if (input_num.startsWith("+")) {
            num_plus = input_num.substring(1);
            int ending_index = num_plus.length() - 10;
            country_code = num_plus.substring(0, ending_index);
            number = num_plus.substring(ending_index);
        } else if (input_num.startsWith("8")) {
            country_code = "7";
            number = input_num.substring(1);
        } else System.out.println("Try again, this number is incorrect.");

        return "+" + country_code + number.substring(0, 3) + "_" + number.substring(3, 6) + "_" +
                number.substring(6);
    }
}
