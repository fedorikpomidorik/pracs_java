package practical_works.prac_7.num_3;

public class Tester {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 0);
        MovablePoint point2 = new MovablePoint(1, -1);

        MovableRectangle rect = new MovableRectangle(point1, point2);

        System.out.println(rect);
        System.out.println("\nMoving left, down, down, down, right, right:\n");

        rect.moveLeft();
        rect.moveDown();
        rect.moveDown();
        rect.moveDown();
        rect.moveRight();
        rect.moveRight();

        System.out.println(rect);

        System.out.println("Point1 speed test: " + point1.speedTest(point2));
    }
}