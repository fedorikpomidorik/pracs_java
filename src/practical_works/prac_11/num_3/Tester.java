package practical_works.prac_11.num_3;

import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("Anufriev Fedor", new Date(2104 - 2000, Calendar.NOVEMBER, 24));
        System.out.println("Short Format: " + student.getFormattedDate("dd/MM/yy"));
        System.out.println("Medium Format: " + student.getFormattedDate("dd/MM/yyyy"));
        System.out.println("Full Format: " + student.getFormattedDate("dd MMMM yyyy"));
    }
}
