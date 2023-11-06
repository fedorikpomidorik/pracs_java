package practical_works.prac_11;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class num_2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        currentDate.setTime((currentDate.getTime() / 1000) * 1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedCurrentDate = dateFormat.format(currentDate);
        System.out.println("Now: " + formattedCurrentDate);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input data (dd-MM-yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();
        scanner.close();
        try {
            Date userDate = dateFormat.parse(userInput);
            if (userDate.before(currentDate)) {
                System.out.println("Input date was earlier than now.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Input date is later.");
            } else {
                System.out.println("Input date is now.");
            }
        } catch (Exception e) {
            System.err.println("You've made a mistake. Try again.");
        }
    }
}