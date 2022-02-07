package StackIterator;

import java.util.Iterator;

public class Stack implements Iterable<Integer>{


    private class Node{
        private int element;
        Node prev;

        public Node(int element){
            this.element = element;
            this.prev = null;
        }
    }
    private Node top;

    public  void push(int element){
        Node newNode = new Node(element);
        newNode.prev = top;
        top = newNode;
    }
    public int pop() throws Exception {
        if (top == null){
           throw new Exception("Empty");
        }else {
            int element = top.element;
            top = top.prev;
            return element;
        }
    }
    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        return false;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node current = top;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                int currentValue = current.element;;
                this.current = current.prev;
                return currentValue;
            }
        };
    }
}
