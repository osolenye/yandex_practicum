package sprint1.type_importance;

public class TypeCasting {
    public void example() {
//        int a = 32.38;

        // неявное преобразование с помощью компилятора
        byte smallNumber = 42;
        checkMethod(smallNumber);

        int integerNum = 9999;
        double doubleNum = integerNum;
        System.out.println(doubleNum);

        // явное преобразование синтаксисом
        int myNum = 40;
        checkByte((byte) myNum);
        int biggerNumber = 1000;
        byte smallerNumber = (byte) biggerNumber;
        System.out.println(smallerNumber);

        double drobNumber = 500.123d;
        System.out.println("in integer double will be: " + (int) drobNumber);
    }

    public void checkMethod(int number) {
        System.out.println("worked. it is an integer");
        System.out.println("value: " + number);
    }

    public void checkByte(byte number) {
        System.out.println("worked. it is a byte");
        System.out.println("value: " + number);
    }
}
