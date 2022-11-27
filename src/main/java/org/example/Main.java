package org.example;

import LambdaLesson.Cat;
import LambdaLesson.Printable;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        printThing(cat);
    }

    public static void printThing(Printable thing) {
        thing.print();
    }
}