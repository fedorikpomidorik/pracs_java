package practical_works.prac_1;

import java.util.Scanner;


public class num_2 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int i = 0;
        int sum = 0, minimum = 100, maximum = -1;
        while (i < 7) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            a[i] = num;
            i++;
            sum += num;
        }
        i = 0;
        while (i < 7) {
            if (minimum > a[i]) {
                minimum = a[i];
            }
            if (maximum < a[i]) {
                maximum = a[i];
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(minimum);
        System.out.println(maximum);
    }
}

