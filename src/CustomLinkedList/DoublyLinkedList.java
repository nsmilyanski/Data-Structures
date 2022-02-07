package CustomLinkedList;


import java.util.function.Consumer;

public class DoublyLinkedList {
    private class ListNode {
        private int item;
        ListNode next;
        ListNode prev;

        private ListNode(int item){
            this.item = item;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int size;

    public int[] toArray(){
        int[] array = new int[this.size];
        ListNode element = this.head;

        int index = 0;

        while (element != null){
            array[index] = element.item;
            element = element.next;
            index++;
        }
        return array;
    }

    public void forEach(Consumer<Integer> consumer){
        ListNode element = this.head;
        while (element != null){
            consumer.accept(element.item);
            element = element.next;
        }
    }

    public void addLast(int element){
        ListNode newTail = new ListNode(element);
        if (size == 0){
            this.head = newTail;
            this.tail = newTail;
            size++;
        }else {
            newTail.prev = this.tail;
            this.tail.next = newTail;
            this.tail = newTail;
            size++;
        }
    }
    public int removeLast(){
        checkSize();
        int lastElement = this.tail.item;
        this.tail = this.tail.prev;

        if (this.tail == null){
            this.head = null;
        }else {
            this.tail.next = null;
        }
        size--;
        return lastElement;
    }

    public int removeFirst(){
        checkSize();

        int firstElemnt = this.head.item;
        this.head = this.head.next;

        if (this.head == null){
            this.tail = null;
        }else {
            this.head.prev = null;
        }
        this.size --;
        return firstElemnt;
    }



    public void addFirst(int element){
        ListNode newHead = new ListNode(element);
        if (size == 0){
            this.head = newHead;
            this.tail = newHead;
        }else {
            newHead.next = this.head;
            this.head.prev = newHead;
            this.head = newHead;
        }
        this.size++;
    }

    private int get(int index){
        checkIndex(index);
       if (index <= size / 2){
           ListNode firstNode = this.head;

           for (int i = 0; i < index; i++) {
               firstNode = firstNode.next;
           }
           return firstNode.item;
       }else {
           ListNode lastNode = this.tail;
           for (int i = size - 1; i > index ; i--) {
               lastNode = lastNode.prev;
           }
           return lastNode.item;
       }
    }

    private void checkIndex(int index) {
        String exception = "";
        if (index < 0 || index >= size){
            exception = String.format("Index %d Size %d", index, size);
            throw new IndexOutOfBoundsException(exception);
        }
    }
    private void checkSize() {
        if (this.size == 0){
            throw new IndexOutOfBoundsException("Index is out Bounds");
        }
    }
}
