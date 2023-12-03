package practical_works.lists_2;

public class Tester {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.add(5);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(8);

        System.out.println("Исходный список:");
        list.display();

        list.sort();

        System.out.println("Отсортированный список:");
        list.display();
    }
}
