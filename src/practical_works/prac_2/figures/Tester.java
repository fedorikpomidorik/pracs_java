package practical_works.prac_2.figures;

import java.util.Scanner;

public class Tester {
    private final Circle[] circles;
    private int numberOfCircles;
    public Tester(int capacity) {
        circles = new Circle[capacity];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Full");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println("Circle " + (i + 1) + ":");

            System.out.println("Center: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Radius: " + circles[i].getRadius());
            System.out.println("Perimeter: "+Math.round(circles[i].Perimeter(circles[i].getRadius())));
            System.out.println("Square: "+ Math.round((circles[i].Square(circles[i].getRadius()))));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the amount of circles: ");
        int x = sc.nextInt();
        Tester tester = new Tester(x);
        Point center = new Point(4,10);
        Circle circle1 = new Circle(center,2);
        Point centerNew = new Point(3,11);
        Circle circle2 = new Circle(centerNew,22);
        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.displayCircles();
    }
}
