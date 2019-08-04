package com.company.week1.assignment2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RightDigit {

    public RightDigit() {
        ArrayList<Integer> digits = new ArrayList();
        for (int i = 0; i < 10; i++) {
            digits.add((int) (Math.random() * 10000));
        }
        digits.forEach(e -> System.out.println(e));
        digits.replaceAll(e -> {
            while (e > 10) {
                e = e % 10;
            }
            return e;
        });
        System.out.println("-----------line break");
        digits.forEach(e -> System.out.println(e));
    }
}
