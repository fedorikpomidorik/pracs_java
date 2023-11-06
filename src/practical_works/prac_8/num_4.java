package practical_works.prac_8;

import java.util.Scanner;

public class num_4 {
    public static void main(String[] args) {
        System.out.println("Type 2 numbers one by one >>>");
        Scanner in1 = new Scanner(System.in);
        int k = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int s = in2.nextInt();
        System.out.println(counter(k, s));
    }

    public static int counter(int k, int s) {
        int count = 0;
        int start = (int) Math.pow(10, k - 1);
        int finish = (int) Math.pow(10, k);

        for (int i = start; i < finish; i++) {
            int sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                sum += Integer.parseInt(String.valueOf((String.valueOf(i).charAt(j))));
            }
            if (sum == s) count += 1;
        }
        return count;
    }
}
