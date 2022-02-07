package StrategyPattern;

import java.util.Comparator;

public class CompareToName implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        int result = first.getName().length() - second.getName().length();

        if (result == 0){
        char firstName = first.getName().toLowerCase().charAt(0);
        char secondName = second.getName().toLowerCase().charAt(0);
        result = Character.compare(firstName, secondName);
        }
        return result;
    }
}
