package practical_works.prac_7.num_1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int x;
        int y;
        String move;
        System.out.println("Type starting coordinates X Y:\n");
        System.out.println("X >>>");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Y >>>");
        y = scanner.nextInt();
        MovableRectangle rect = new MovableRectangle(x, y);

        boolean exit = true;

        while (exit) {
            System.out.println("What to do?\n");
            System.out.println("-Up");
            System.out.println("-Down");
            System.out.println("-Left");
            System.out.println("-Right");
            System.out.println("-exit");
            move = scanner.next().toLowerCase();
            switch (move) {
                case ("up") -> {
                    rect.moveUp();
                    System.out.println(rect.toString());
                }
                case ("down") -> {
                    rect.moveDown();
                    System.out.println(rect.toString());
                }
                case ("left") -> {
                    rect.moveLeft();
                    System.out.println(rect.toString());
                }
                case ("right") -> {
                    rect.moveRight();
                    System.out.println(rect.toString());
                }
                case ("exit") -> {
                    System.out.println("Movements stopped\n");
                    System.out.println(rect.toString());
                    exit = false;
                }
                default -> {
                    System.out.println("Try again\n");
                }
            }
        }
    }
}
