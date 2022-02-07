package CustomLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addFirst(5);
        doublyLinkedList.addFirst(17);
        doublyLinkedList.addFirst(55);
        doublyLinkedList.addFirst(98);

        doublyLinkedList.addLast(98);

        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();


        int[] ints = doublyLinkedList.toArray();


        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
