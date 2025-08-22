package sprint5;

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
    }
}
