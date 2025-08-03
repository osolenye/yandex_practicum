package sprint2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ObjectClass {
    public void example() {
        // object
        Object anyObject;
        anyObject = 5;
        System.out.println(anyObject.hashCode());
        Integer a = 5;
        System.out.println(a.getClass());

        // object equals method
        Book book1 = new Book("peace and war", 9999);
        Book book2 = new Book("peace and war", 9999);
        System.out.println(book1.equals(book2));

        // object hashcode method
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        ArrayList<Book> books = new  ArrayList<>();
        HashMap<Book, String> contacts =  new  HashMap<>();

        books.add(book1);
        contacts.put(book1, "peace and war");

        System.out.println("size of the arraylist: " + books.size() + " size of the hashmap: " + contacts.size());
        System.out.println(books.contains(book2));


        //object toString method
        System.out.println(book1.toString());
        System.out.println(book1);
    }
}

class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return Objects.equals(this.title, otherBook.title) && this.pages == otherBook.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.pages);
    }

    @Override
    public String toString() {
        return "Book\n" +
                "{title: " + this.title + "\n" +
                "pages: " + this.pages + "}";
    }
}