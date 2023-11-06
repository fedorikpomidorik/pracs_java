package practical_works.prac_3.Random;

import java.util.Arrays;
import java.util.Scanner;

public class num_4 {
    public static int rnd(int a) {
        return (int) (Math.random() * ++a);
    }

    public static void main(String[] args) {
        System.out.println("Type integer number that is bigger than 5:");
        int x;
        while (true) {
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            if (x > 5) {
                break;
            }
            System.out.println("Try again");
        }
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = rnd(x);
        }
        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Even array:");
        int counter = 0;
        for (int i = 0; i < x; i++){
            if (array[i] % 2 == 0){
                counter++;
            }
        }
        int[] even_array = new int[counter];
        int n = 0;
        for (int i = 0; i < x; i++){
            if (array[i] % 2 == 0){
                even_array[n] = array[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(even_array));
    }
}
