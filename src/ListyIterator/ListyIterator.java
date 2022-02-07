package ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> list;
    private int index;

    public ListyIterator(List<String> list){
        this.list = list;
        if (list.isEmpty()){
            index = -1;
        }else {
            index = 0;
        }
    }

    public  boolean move(){
        if (index < list.size() - 1){
            index++;
            return true;
        }else {
            return false;
        }
    }

    public boolean hasNext(){
        return index < list.size() - 1;
    }

    public  void print(){
        if (index <= list.size() - 1 && index >= 0){
            System.out.println(list.get(index));
        }else {
            System.out.println("Invalid Operation!");
        }
    }

    public  void printAll(){
            StringBuilder sb = new StringBuilder();
        for (String s: list) {
            sb.append(s).append(" ");
        }
        sb.append(System.lineSeparator());
        System.out.print(sb);
    }



        @Override
        public Iterator<String> iterator () {
            return new Iterator<String>() {
                int index = 0;
                @Override
                public boolean hasNext() {
                    return index < list.size() - 1;
                }

                @Override
                public String next() {
                    return list.get(index++);
                }
            };
        }

}
