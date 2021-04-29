package com.exercise;

public class Main {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        Thread thread = new Thread(helloThread);
        thread.start();
        try {
            Thread.sleep(2000);
            System.out.println("Interrupted");
            helloThread.quitOrNot();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
