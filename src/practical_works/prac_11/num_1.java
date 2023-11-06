package practical_works.prac_11;

import java.util.Date;

public class num_1 {
    public static void main(String[] args) {
        String name = "Anufriev";
        Date gettingTask = new Date();
        long gettingTask_precisely = gettingTask.getTime();
        long handingTask = gettingTask_precisely + 7 * 24 * 60 * 60 * 1000;
        Date handingTask_precisely = new Date(handingTask);
        System.out.println("Surname: " + name);
        System.out.println("Date of taking the task: " + gettingTask);
        System.out.println("Date of handing: " + handingTask_precisely);
    }
}
