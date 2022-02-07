package Froggy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] integers = Arrays.stream(scanner.nextLine().split("[, ]+")).map(Integer::parseInt)
                .toArray(Integer[]::new);

        Lake lake = new Lake(integers);


            StringBuilder sb = new StringBuilder();

            for (Integer element: lake) {
                sb.append(element).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
    }
}
