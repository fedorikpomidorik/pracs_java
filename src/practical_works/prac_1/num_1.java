package practical_works.prac_1;

import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            a[i] = num;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        float srar = (float) sum / a.length;
        System.out.println(sum);
        System.out.println(srar);
    }
}
