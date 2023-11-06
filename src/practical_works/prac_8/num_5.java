package practical_works.prac_8;

import java.util.Scanner;

public class num_5 {
    static int sum(int n, int sum) {
        if (n == 0) {
            return sum;
        } else {
            sum += n % 10;
            n /= 10;
            return sum(n, sum);
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number >>>");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Sum of it's digits:");
        System.out.println(sum(x, 0));
    }
}
