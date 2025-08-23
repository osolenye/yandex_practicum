package sprint5.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        // close the stream otherwise OS will not be able to read the file
        // instead of using FINALLY block after failing we can add the craetion of the FileReader instance in the try
        try (Reader fileReader = new FileReader("/home/osolenye/programming/yandex_practicum/src/main/java/sprint5/files/fileWriter.txt")) {
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
