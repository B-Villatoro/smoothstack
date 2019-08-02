package com.company.day5;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortsPart2 {
    private ArrayList<Integer> myNumbers = new ArrayList<>();
    private ArrayList<String> myStrings = new ArrayList<>();

    public SortsPart2(){
//        evenOrOdd();
        startsWithAOnly3();



    }

    public void evenOrOdd(){
        for(int i = 0; i < 4; i++){
            myNumbers.add(i,(int) (Math.random()*100));
        }
        myNumbers.stream().map(e-> {
            if (e%2 == 1){
                return ("O"+e);
            }
            else{
                return ("E"+e);
            }
        }).forEach(e-> System.out.println(e));
    }

    public void startsWithAOnly3(){
        myStrings.add("Apple");
        myStrings.add("agenda");
        myStrings.add("abbb");
        myStrings.add("Abbb");
        myStrings.add("abbcc");
        myStrings.add("Abbcc");
        myStrings.stream().filter(e->{
            if(e.charAt(0) == 'a' && e.length() <5){
                return true;
            }
            else return false;
        }).forEach(e-> System.out.println(e));
    }

}
