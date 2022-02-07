package StrategyPattern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> nameSet = new TreeSet<>(new CompareToName());
        Set<Person> ageSet = new TreeSet<>(new CompareToAge());

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");

            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            Person person = new Person(name, age);

            nameSet.add(person);
            ageSet.add(person);
        }

        nameSet.forEach(System.out::println);
        ageSet.forEach(System.out::println);
    }
}
