package practical_works.prac_2;

import java.util.Scanner;

public class HowMany {
    static int counting(String in) {
        String[] splitted = in.split(" ");
        return splitted.length;
    }
    public static void main(String[] args) {
        System.out.println("Insert words:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(counting(input));
    }
}
