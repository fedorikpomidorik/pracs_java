package practical_works.prac_1;

import java.util.Scanner;

public class num_5 {
    static int fact(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number to find its factorial: ");
        int num = in.nextInt();
        System.out.println(fact(num));
    }
}
