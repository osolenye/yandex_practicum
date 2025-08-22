package sprint5;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        // literal: String str = "sdf";  via class: String str = new Class("asdf");
        // try to always use literal cuz String will go to the string pull and can be reused
        String one = "yes";
        String two = "yes";
        String three = new String("yes");
        System.out.println(one == two); // cuz they get the link from the string pull and reuse it
        System.out.println(one == three); //can't reuse because of not using literal

        String notEmpty = "   ";
        System.out.println(one.length()); 
        System.out.println(notEmpty.trim().isEmpty()); 

        // substring are case sensitive
        // indexOf searches from left, lastIndexOf from right
        String start = "Hello, World the Worst thing ever!!";
        System.out.println(start.indexOf("World", 10)); // starting index optional
        System.out.println(start.lastIndexOf("World the", 10));

        String gettingChar = "sybau";
        System.out.println(gettingChar.charAt(1));

        System.out.println(uniqueSubstring("раз два три раз", "раз")); 

        // getting a substring by the index
        String masterString = "Half life 2";
        System.out.println(masterString.substring(2, 4));

        // changing string even tho they are immutable bruh
        String changeString = "one, two, three, one";
        System.out.println(changeString.replace("one", "has been changed"));

        //StringBuilder class hurray
        StringBuilder stringBuilder = new StringBuilder(100); //can add the starting size
        stringBuilder.append("one, two, three, one"); // reallocated memory when added values
        System.out.println(stringBuilder);

        // breaking a string sentence
        String excellent = "Bob Sapp, SADF SDF, DFdfj, SDF, ADFFD sdfdjdj, DSFD DFDFA, DFDDFDF";
        String[] excellentArray = excellent.split(",");
        System.out.println(Arrays.toString(excellentArray));
        String regexRules = "lsjflsk ? jdflasd ? lksdfkldsa ? sjfds ? sdjfl";
        String[] regexRulesArray = regexRules.split("\\?"); // some symbols can't be used as a regex argument
        System.out.println(Arrays.toString(regexRulesArray));

        // making a string out of array of strings
        String[] arrayToJoin = new String[]{
                "lkjasdf",
                "klajsdlfkas",
                "alskdjfsld"
                };
        String joinedArray = String.join(" ", arrayToJoin); // can take any amount of arguments after delimiter - called varargs
        System.out.println(joinedArray);


        //String formatting
        String[] trafficLights = {"red", "green", "yellow"};
        System.out.printf("All the lights: %s %s %s", trafficLights[0], trafficLights[1], trafficLights[2]); //printf to format out
    }

    static boolean uniqueSubstring(String str, String subStr) {
        // checking the indexes if they have different indexes and if they do there are more than one substr
        return str.indexOf(subStr) == str.lastIndexOf(subStr);
    }
}
