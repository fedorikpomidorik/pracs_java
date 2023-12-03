package practical_works.lists_2;

public class DoublyCircularLinkedList {
    Node head;

    public DoublyCircularLinkedList() {
        this.head = null;
    }

    // метод добавления элемента в конец списка
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node lastNode = head.prev;
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = lastNode;
            lastNode.next = newNode;
        }
    }

    // метод вывода списка на экран
    public void display() {
        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    // метод сортировки списка
    public void sort() {
        Node current = head;
        int x = 0;

        do {
            Node nextNode = current.next;

            if (current.data > nextNode.data) {
                // перестановка соседних элементов
                current.next = nextNode.next;
                nextNode.prev = current.prev;
                current.prev.next = nextNode;
                nextNode.next.prev = current;
                current.prev = nextNode;
                nextNode.next = current;

                // если переставили первый элемент, то обновляем указатель на голову списка
                if (current == head) {
                    head = nextNode;
                }

                // продолжаем сортировку с предыдущего элемента
                current = nextNode.prev;
            } else {
                current = current.next;
            }
            x++;
        } while (x<10000);

    }
}
