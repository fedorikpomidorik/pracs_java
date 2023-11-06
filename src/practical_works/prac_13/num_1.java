package practical_works.prac_13;

import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner in = new Scanner(System.in);
        String sstring = in.nextLine();
        processing(sstring);
        iLikeJava();
    }

    public static void processing(String sstring) {
        System.out.println(sstring.charAt(sstring.length() - 1));
        System.out.println(sstring.endsWith("!!!"));
        System.out.println(sstring.startsWith("I like"));
        System.out.println(sstring.contains("Java"));
        System.out.println();
    }

    public static void iLikeJava() {
        String mainstring = "I like Java!!!";
        int x = mainstring.indexOf("Java");
        System.out.println(x);
        System.out.println(mainstring.replace('a', 'o'));
        System.out.println(mainstring.toUpperCase());
        System.out.println(mainstring.toLowerCase());
        System.out.println(mainstring.substring(x, x + 4));
    }

}
