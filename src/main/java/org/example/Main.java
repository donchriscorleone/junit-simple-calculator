package org.example;

import LambdaLesson.Cat;
import LambdaLesson.Printable;

public class Main {
    public static void main(String[] args) {
        Printable thing = () -> "Meow " + "!!!";
        Cat cat = new Cat();

        printThing(thing);
    }

    public static void printThing(Printable thing) {
        System.out.println(thing.print());
    }
}