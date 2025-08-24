package sprint5.files;

import java.io.File;

public class FilesEssentials {
    public static void main(String[] args) {
        // it is in charge of
        File dir = new File("D:\\programming\\yandex_practicum\\src\\main\\java\\sprint5\\files");
        // using a dir as a parent folder and other files will be the child files of the folder
        File testTxt = new File(dir, "test.txt");

        // check if the parent folder even exists
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println("dir's name: " + item.getName());
                } else if (item.isFile()) {
                    System.out.println("file's name: " + item.getName());
                }
            }
        }

        // boolean mkdir() method creates a dir
        // boolean renameTo obvious
        // boolean delete() obvoius



    }
}
