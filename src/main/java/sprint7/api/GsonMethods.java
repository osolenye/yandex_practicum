package sprint7.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonMethods {
    public static void main(String[] args) {
        // GsonBuilder is used to modify Gson's constructor to set settings of serializing
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Dog dog = new Dog("Sharik", "Yellow");
        Gson gson = gsonBuilder.create();
        String prettyDog = gson.toJson(dog);
        System.out.println(prettyDog);
        // serializeNull by default null fields don't go to json, but this will put them to json

    }
}
