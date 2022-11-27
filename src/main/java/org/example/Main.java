package org.example;

import thread.MultiThread;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultiThread thread = new MultiThread(i);
            thread.start();
        }
    }
}