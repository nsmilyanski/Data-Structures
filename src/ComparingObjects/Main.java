package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("END")){
            String[] token = input.split(" ");
            String name = token[0];
            int age = Integer.parseInt(token[1]);
            String town = token[2];
            Person person = new Person(name, age, town);
            personList.add(person);


            input = scanner.nextLine();
        }

        int personToCompare = Integer.parseInt(scanner.nextLine()) - 1;

        Person toCompare = personList.get(personToCompare);

        int numOfEqualPeople = 0;

        for (Person gay: personList) {
            if (gay.compareTo(toCompare) == 0){
                numOfEqualPeople++;
            }

        }

        int notEqual = personList.size() - numOfEqualPeople;


        if (numOfEqualPeople == 1){
            System.out.println("No matches");
        }else {
            System.out.printf("%d %d %d", numOfEqualPeople, notEqual, personList.size());
        }


    }
}
