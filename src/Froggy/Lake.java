package Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private List<Integer> numbers;

    public Lake(Integer... numbers) {
        this.numbers = Arrays.asList(numbers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Integer> {
        private int counter;

        private Frog() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return numbers.size() > counter;
        }

        @Override
        public Integer next() {
            counter += 2;
            int element = numbers.get(counter - 2);
            if (counter % 2 == 0 && counter >= numbers.size()) {
                counter = 1;
            }
            return element;
        }
    }

}