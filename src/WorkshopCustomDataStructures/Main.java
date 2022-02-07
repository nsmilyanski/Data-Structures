package WorkshopCustomDataStructures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CustomStack customStack = new CustomStack();

      boolean element = customStack.isEmpty();
        System.out.println(element);
    }
}
