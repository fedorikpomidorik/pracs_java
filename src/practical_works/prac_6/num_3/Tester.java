package practical_works.prac_6.num_3;

public class Tester {
    public static void main(String[] args) {
        Cars car1 = new Cars("Porsche");
        Cars car2 = new Cars("BMW");
        Cars car3 = new Cars("Mercedes");
        System.out.println("First car:");
        car1.getName();
        System.out.println("Second car:");
        car2.getName();
        System.out.println("Third car:");
        car3.getName();
    }
}
