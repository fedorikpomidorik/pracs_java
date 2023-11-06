package practical_works.prac_4_1;

public class Tester {
    public static void main(String[] args) {
        System.out.println();
        Circle circle = new Circle("Blue", true, 3.0);
        System.out.println(circle.toString());
        System.out.println("S: " + circle.getArea());
        System.out.println("P: " + circle.getPerimeter());

        System.out.println();
        Rectangle rectangle = new Rectangle("Red", true, 2.5, 4.5);
        System.out.println(rectangle.toString());
        System.out.println("S: " + rectangle.getArea());
        System.out.println("P: " + rectangle.getPerimeter());

        System.out.println();
        Square square = new Square("Purple", false, 2.0, 2.0);
        System.out.println(square.toString());
        System.out.println("a: " + square.getSide());
    }
}
