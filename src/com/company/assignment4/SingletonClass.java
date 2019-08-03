package com.company.assignment4;

public class SingletonClass {
    private static volatile SingletonClass instance;
    public static SingletonClass getInstance() {
        if(instance ==null){
            synchronized (SingletonClass.class){
                if(instance == null){
                    instance = new SingletonClass();

                }
            }
        }
        return instance;
    }
}
