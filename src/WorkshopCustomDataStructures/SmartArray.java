package WorkshopCustomDataStructures;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int data[];
    private int size;
    private int capacity;

    public SmartArray(){
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(data[i]);
        }
    }

    public boolean contains(int element){
        boolean isContains = false;
        for (int i = 0; i < size; i++) {
            if (element == data[i]){
                return true;
            }
        }
        return false;
    }

    public void add(int index, int element){
        chechIndex(index);
        if (index == this.size - 1){
            add(this.data[size - 1]);
            this.data[size - 2] = element;
        }else {
            size++;
            shiftRight(index);
            data[index] = element;
        }
    }

    public int remove(int index){
        chechIndex(index);
        int element = this.data[index];
        shift(index);
        size--;
        if (this.size <= this.capacity / 4){
            shrink();
        }
        return element;
    }

    public int get(int index){
        chechIndex(index);
        return data[index];
    }

    public void add(int element){
        if (this.size == this.capacity){
            this.resize();
        }
        this.data[this.size] = element;
        this.size++;
    }


    private void resize(){
        this.capacity *= 2;
        int[] copy = new int[this.capacity];

        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }

        this.data = copy;
    }

    private void chechIndex(int index){
        if (index <= 0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException("The Index is out of Bounds");
        }
    }

    private void shift(int index){
        for (int i = index; i < size - 1 ; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
    }
    private void shrink(){
        this.capacity *= 2;

        int[] copy = new int[this.capacity];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = data[i];
        }
        this.data = copy;
    }
    public void shiftRight(int index){
        for (int i = size - 1; i < index ; i--) {
            data[i] = data[i - 1];
        }
    }

}
