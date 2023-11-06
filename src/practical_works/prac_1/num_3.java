package practical_works.prac_1;


public class num_3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
        } else {
            System.out.println("Arguments of command string:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
