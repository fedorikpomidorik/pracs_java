package practical_works.prac_3.Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of array: ");
        int lengthh = scanner.nextInt();
        double[] array2 = new double[lengthh];
        double[] array1 = new double[lengthh];
        for (int i = 0; i < lengthh; i++) {
            array1[i] = Math.random();
        }
        System.out.println("Random array with Random: ");
        System.out.println(Arrays.toString(array1));
        System.out.println();
        Arrays.sort(array1);
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.println();
        for (int i = 0; i < lengthh; i++) {
            array2[i] = random.nextDouble();
        }
        System.out.println("Random array with random(): ");
        System.out.println(Arrays.toString(array2));
        System.out.println();
        Arrays.sort(array2);
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(array2));

    }
}
