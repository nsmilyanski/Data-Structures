package StackIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Stack stack = new Stack();

        while (!input.equals("END")){
            String command = input.split(" ")[0];

            if (command.equals("Push")){
                List<String> stringList = Arrays.stream(input.split("[ |,]+")).skip(1)
                        .collect(Collectors.toList());
                for (String number: stringList) {
                    int num = Integer.parseInt(number);
                    stack.push(num);
                }
            }else if (command.equals("Pop")){
                try {
                stack.pop();
                }catch (Exception e){
                    System.out.println("No elements");
                }

            }

            input = scanner.nextLine();
        }

            for (int i = 0; i < 2; i++) {
                stack.forEach(e -> System.out.println(e));
            }

    }
}
