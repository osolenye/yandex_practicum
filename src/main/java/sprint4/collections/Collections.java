package sprint4.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        // methods from interface Iterable<T>
        for (String string : strings) {
            System.out.println(string);
        }

        final Iterator<String> iterator;
        iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // methods from Collection<T>
        // add remove contains size isEmpty
        //addAll removeAll containsAll

        
    }
}
