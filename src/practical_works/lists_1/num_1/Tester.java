package practical_works.lists_1.num_1;

import java.util.Stack;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", 19, 171);
        Student student2 = new Student("Igor", 8, 180);
        Stack<Student> stack = new Stack<>();
        stack.add(student1);
        stack.add(student2);
        System.out.println("после добавления в список:");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println("после удаления студента:");
        System.out.println(stack.toString());
    }
}
