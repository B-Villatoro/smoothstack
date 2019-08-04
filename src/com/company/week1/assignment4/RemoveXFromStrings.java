package com.company.week1.assignment4;

import java.util.ArrayList;

public class RemoveXFromStrings {
    public RemoveXFromStrings() {
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add("aaaaxbbbb");
        myStrings.add("aaaaxxccbb");
        myStrings.add("aaxdddd");
        myStrings.add("aaxbxxxb");
        myStrings.forEach(System.out::println);
        myStrings.forEach(e -> {
            int i = myStrings.indexOf(e);
            e = (e.replaceAll("x", ""));
            myStrings.set(i, e);
        });

        System.out.println("-----------line break");
        myStrings.forEach(System.out::println);
    }
}
