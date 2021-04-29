package com.exercise;

public class HelloThread implements Runnable {
    private volatile boolean quit = false;

    @Override
    public void run() {
        while (!quit) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void quitOrNot() {
        quit = true;
    }
}
