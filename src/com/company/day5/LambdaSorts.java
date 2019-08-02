package com.company.day5;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class LambdaSorts {
    private ArrayList<String> myList = new ArrayList<>();

    public LambdaSorts() {
        addToList();
        System.out.println("Short to long");
        sortByLength();
        System.out.println("\nLong to short");
        sortByReverseLength();
        System.out.println("\nSort by alphabet");
        sortByChar();
        System.out.println("\nBig mess coming up");
        sortByCharWithEfirst();
    }

    public void sortByLength() {
        myList.stream().sorted(Comparator.comparingInt(String::length)).forEach(e -> System.out.println(e));

    }

    public void sortByReverseLength() {
        myList.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(e -> System.out.println(e));
    }

    public void sortByChar() {
        myList.stream().sorted((e1, e2) -> e1.compareToIgnoreCase(e2)).forEach(e -> System.out.println(e));
    }

    public void sortByCharWithEfirst() {
        myList.stream().sorted((e1, e2) -> helpCompareE(e1,e2)
        ).forEach(e -> System.out.println(e));
    }

    public static int helpCompareE(String e1, String e2){
        if (e1.charAt(0) == 'e' || e1.charAt(0) == 'E') {
            return -26;
        } else if (e1.charAt(0) == 'e' || e1.charAt(0) == 'E' && e2.charAt(0) == 'e' || e2.charAt(0) == 'E') {
            return (e1.compareToIgnoreCase(e2) - 26);
        } else {
            return e1.compareToIgnoreCase(e2);
        }
    }

    public void addToList() {
        myList.add("Hello");
        myList.add("Taco");
        myList.add("Nacho");
        myList.add("Chipotle");
        myList.add("Burrito");
        myList.add("Jalapeno");
        myList.add("Enchilada");
    }
}//end Class

