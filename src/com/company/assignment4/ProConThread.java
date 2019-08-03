package com.company.assignment4;

public class  ProConThread {
    public ProConThread(){
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private Boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        empty = false;
        this.message = message;
        notifyAll();

    }

}

class Writer implements Runnable {
    private Message message;
    public Writer(Message message) {
        this.message = message;
    }
    @Override
    public void run() {
        String messages[] = {"taco", "burrito", "banana","bruno"};
        System.out.println("Writing!");
        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Done");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        for (String latestMessage = message.read(); !latestMessage.equals("Done"); ) {
            latestMessage = message.read();
            System.out.println(latestMessage);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}