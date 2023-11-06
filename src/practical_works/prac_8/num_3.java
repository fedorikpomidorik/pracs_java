package practical_works.prac_8;

import java.util.Scanner;

public class num_3 {
    public static void main(String[] args) {
        System.out.println("Type 2 numbers one by one >>>");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();
        printer(a, b);
    }

    public static void printer(int a, int b) {
        int a_a = 0;
        int b_b = 0;
        boolean exit = true;

        if (a < b) {
            a_a = a;
            b_b = b;
        } else if (a > b) {
            a_a = b;
            b_b = a;
        } else {
            System.out.println(a);
            exit = false;
        }
        if (exit) {
            for (int i = a_a; i < b_b + 1; i++) {
                System.out.println(i);
            }
        }
    }
}
