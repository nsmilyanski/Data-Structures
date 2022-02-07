package WorkshopCustomDataStructures;

import java.util.function.Consumer;

public class CustomStack {
    private static int INITIAL_CAPACITY = 4;
    private int[] items;
    private int size;
    private int capacity;

    public CustomStack(){
        this.capacity = INITIAL_CAPACITY;
        this.items = new int[this.capacity];
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(items[i]);
        }
    }

    public int peek(){
        return items[size - 1];
    }

    public int pop(){
        int element = items[size - 1];
        size--;
        return element;
    }

    public  void push(int element){

        if (size == this.capacity){
            resize();
        }
        this.items[this.size] = element;
        size++;
    }

    private void resize() {
        capacity *= 2;
        int[] copy = new int[capacity];

        for (int i = 0; i < items.length ; i++) {
            copy[i] = items[i];
        }
        items = copy;
    }
}
