package org.example;

import inputoutput.FileReaderThing;
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

        FileReaderThing reader = new FileReaderThing("output.txt");
        while (true) {
            try {
                String line = reader.getReader().readLine();
                if (line == null) break;

                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        reader.close();
    }
}