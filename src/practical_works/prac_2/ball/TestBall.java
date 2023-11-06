package practical_works.prac_2.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100.0, 100.0);
        System.out.println("Coordinates of ball: " + ball.toString());
        ball.move(4.0, 6.0);
        System.out.println("New coordinates: " + ball);
        ball.setXY(52, 52);
        System.out.println("New coordinates: " + ball);
    }
}
