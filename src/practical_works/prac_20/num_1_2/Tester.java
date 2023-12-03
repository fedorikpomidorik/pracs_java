package practical_works.prac_20.num_1_2;

public class Tester {
    public static void main(String[] args) {
        Classs<Integer, String, Double> object = new Classs<>(1, "Ni", 17573644637.23324343);

        System.out.println("T: " + object.getT());
        System.out.println("V: " + object.getV());
        System.out.println("K: " + object.getK());

        System.out.println(object.toString());

        object.displayTypes();
    }
}
