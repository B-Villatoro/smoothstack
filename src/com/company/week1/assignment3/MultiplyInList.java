package com.company.week1.assignment3;

import java.util.ArrayList;

public class MultiplyInList {

    public MultiplyInList() {

        ArrayList<Integer> digits = new ArrayList();
        for (int i = 0; i < 10; i++) {
            digits.add((int) (Math.random() * 10000));
        }
        digits.forEach(System.out::println);
        digits.replaceAll(e -> e = e*2);
        System.out.println("-----------line break");
        digits.forEach(System.out::println);
    }
}
