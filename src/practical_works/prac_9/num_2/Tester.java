package practical_works.prac_9.num_2;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Egor", 76));
        students.add(new Student("Renat", 74));
        students.add(new Student("Kostya", 56));
        students.add(new Student("Ashot", 98));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students,0, students.size()-1);
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getExamScore());
        }
    }
}
