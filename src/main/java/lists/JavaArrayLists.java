package lists;


import java.util.ArrayList;

public class JavaArrayLists {
    public void example() {
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(123.0);
        expenses.add(0, 12.0);
        System.out.println(expenses);
        System.out.println(expenses.get(0));
        System.out.println(expenses.size());
        expenses.remove(0);
        System.out.println(expenses);
        expenses.remove(123.0);
        System.out.println(expenses);
        expenses.add(123.0);
        expenses.add(0, 12.0);
        System.out.println(expenses);
        expenses.clear();
        System.out.println(expenses);
    }
}
