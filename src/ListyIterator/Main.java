package ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ListyIterator listyIterator = null;

        while (!input.equals("END")){
            String command = input.split(" ")[0];

            switch (command){
                case "Create":
                    List<String> stringList = Arrays.stream(input.split(" "))
                            .skip(1).collect(Collectors.toList());
                    listyIterator = new ListyIterator(stringList);
                    input = scanner.nextLine();
                    break;
                    case "Move":
                        System.out.println(listyIterator.move());
                        input = scanner.nextLine();
                        break;
                case "Print":
                    listyIterator.print();
                    input = scanner.nextLine();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    input = scanner.nextLine();
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    input = scanner.nextLine();
                    break;
                }
            }

        }
    }

