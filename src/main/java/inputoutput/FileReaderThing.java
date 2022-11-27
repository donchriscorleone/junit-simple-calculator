package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThing {
    private BufferedReader reader;

    public FileReaderThing(String fileName) {
        try {
            this.reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public void close() {
        try {
            this.reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public BufferedReader getReader() {
        return reader;
    }
}
