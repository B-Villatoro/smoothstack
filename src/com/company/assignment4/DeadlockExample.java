package com.company.assignment4;

public class DeadlockExample {


    public DeadlockExample(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Thread t1 = new Thread(new MyThread(obj1, obj2));
        Thread t2 = new Thread(new MyThread(obj2, obj3));
        Thread t3 = new Thread(new MyThread(obj3, obj1));
        t1.start();
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        t3.start();
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyThread implements Runnable {
    //Thread that is an example of Deadlock
    private Object obj1;
    private Object obj2;

    public MyThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " locking on "+obj1);
        synchronized (obj1) {
            work();
            System.out.println(name + " locking on "+obj2);
            synchronized (obj2) {
                System.out.println(name + " locking on "+obj2);
                work();
            }
            System.out.println(name + " unlocked "+obj2);
        }
        System.out.println(name + " unlocked "+obj1);
        System.out.println(name + " finished execution.");
    }

    private void work(){
        try {
            Thread.sleep(30000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


