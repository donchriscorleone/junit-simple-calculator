package org.example;

import inputoutput.FileWriterThing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] names = {"John", "Henry", "Kevin"};

        FileWriterThing writer = new FileWriterThing("output.txt");
        writer.write("Writing a file...");
        writer.write("\nNew line...");

        for (String name: names)
            writer.write("\n" + name);

        writer.close();
    }
}