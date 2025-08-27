package sprint7.api;

import com.google.gson.Gson;

import java.time.LocalDate;

public class Serializing {
    public static void main(String[] args) {
        // serializing and deserializing is a process of making json or getting a class from json
        // GSON library is used to serialize or deserialize objects
        Gson gson = new Gson();
        Dog dog = new Dog("Misha", "blue");
        String dogJson = gson.toJson(dog);
        System.out.println(dogJson);
        Dog dogFromJson = gson.fromJson(dogJson, Dog.class);
        System.out.println(dogFromJson);
    }
}

class Dog {
    String name;
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

// POJO-class (plain class that doesn't implement other interfaces, not inehiring etc)
// POJO class is used for responses to requests to the server
class UserPost {
    private String photoUrl;
    private LocalDate publicationDate;
    private int userID;
    private String description;
    private int likesQuantity;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikesQuantity() {
        return likesQuantity;
    }

    public void setLikesQuantity(int likesQuantity) {
        this.likesQuantity = likesQuantity;
    }
}