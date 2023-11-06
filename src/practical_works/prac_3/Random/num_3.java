package practical_works.prac_3.Random;

import java.util.Arrays;

public class num_3 {
    public static int rnd() {
        int a = 89;
        return (int) (Math.random() * ++a) + 10;
    }

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = rnd();
        }
        int[] array_s = Arrays.copyOf(array, 4);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array_s);
        if (Arrays.equals(array, array_s)) {
            System.out.println("Strictly increasing array");
        } else System.out.println("Not strictly increasing array");
    }
}
