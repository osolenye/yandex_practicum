package sprint5.files;

import java.io.*;

public class ReadingAndWriting {
    public static void main(String[] args) throws IOException {
        // reading and writing is done using streams of bytes: input stream, output stream
        // every stream class has almost the same methods
        // add true as a second parameter to append the text and not generate the text from empty file
        Writer fileWriter = new FileWriter("/home/osolenye/programming/yandex_practicum/src/main/java/sprint5/files/fileWriter.txt", true);

        fileWriter.write("Hello World");
        fileWriter.close();

        //Reading the contents of a file
        Reader fileReader = new FileReader("/home/osolenye/programming/yandex_practicum/src/main/java/sprint5/files/fileWriter.txt");
        int data = fileReader.read();
        // -1 is returned when there is no text left
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }
        fileReader.close();

        // to not read every char we can use *bufferisation* - a place in memory that stores something for a while
        // BufferReader is the class for this
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/osolenye/programming/yandex_practicum/src/main/java/sprint5/files/fileWriter.txt"));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
