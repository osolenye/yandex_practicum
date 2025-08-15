package sprint4.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        // empty list immutable
        List<String> emptyList = Collections.emptyList();
        System.out.println(emptyList.toString());

        // immutable list of one element
        List<String> singletonList = Collections.singletonList("one element");
        System.out.println(singletonList.toString());

        // immutable list of one element multiplied N times
        List<String> nCopies = Collections.nCopies(343, "one");
        System.out.println(nCopies.toString());

        List<String> mutableList = new ArrayList<>(nCopies);
        System.out.println(mutableList.toString());
    }
}
