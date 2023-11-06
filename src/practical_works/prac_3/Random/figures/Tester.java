package practical_works.prac_3.Random.figures;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    private final Circle[] circles;
    private int size;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        size = 0;
    }

    public void addCircle(Circle circle) {
        if (size < circles.length) {
            circles[size] = circle;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public Circle findSmallestCircle() {
        if (size == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < size; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findBiggestCircle() {
        if (size == 0) {
            return null;
        }

        Circle biggestCircle = circles[0];
        for (int i = 1; i < size; i++) {
            if (circles[i].getRadius() > biggestCircle.getRadius()) {
                biggestCircle = circles[i];
            }
        }
        return biggestCircle;
    }

    public void sortCircle() {
        Arrays.sort(circles, 0, size, (circle1, circle2) -> Double.compare(circle1.getRadius(), circle2.getRadius()));
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount of circles:");
        Tester tester = getTester();

        System.out.println("All circles: ");
        for (Circle circle : tester.circles) {
            System.out.println(circle);
        }

        System.out.println("\nThe smallest one: ");
        Circle smallestCircle = tester.findSmallestCircle();
        System.out.println(smallestCircle);

        System.out.println("\nThe biggest one: ");
        Circle biggestCircle = tester.findBiggestCircle();
        System.out.println(biggestCircle);

        tester.sortCircle();
        System.out.println("\nSorted by radius circles:");
        for (Circle circle : tester.circles) {
            System.out.println(circle);
        }
    }

    private static Tester getTester() {
        Scanner scanner = new Scanner(System.in);
        int countTesters = scanner.nextInt();
        Tester tester = new Tester(countTesters);
        Random random = new Random();

        for (int i = 0; i < countTesters; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            double radius = random.nextDouble() * 5;
            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }
        return tester;
    }
}