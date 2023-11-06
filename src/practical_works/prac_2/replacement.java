package practical_works.prac_2;

import java.util.*;

public class replacement {

    public static void main(String[] args) {
        List<Object> listt = new ArrayList<>();
        System.out.println("Insert the amount of elements:");
        Scanner in1 = new Scanner(System.in);
        int amount = in1.nextInt();
        System.out.println("Insert the elements one by one:");
        for (int i = 0; i < amount; i++) {
            Scanner in2 = new Scanner(System.in);
            String element = in2.nextLine();
            listt.add(element);
        }
        System.out.println("Entered list:");
        System.out.println(listt);
        Collections.reverse(listt);
        System.out.println("Reversed list:");
        System.out.println(listt);
    }
}
