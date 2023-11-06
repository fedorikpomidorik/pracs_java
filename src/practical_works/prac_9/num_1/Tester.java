package practical_works.prac_9.num_1;

public class Tester {
    public static void displayStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(2, "Sanya"),
                new Student(1, "Lenya"),
                new Student(3, "Zhenya"),
        };

        System.out.println("Before sorting:");
        displayStudent(students);
        insertionSort(students);
        System.out.println("\nAfter sorting by iDNumber:");
        displayStudent(students);
    }
}
