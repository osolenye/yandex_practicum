package sprint1.type_importance;

public class WrapperClasses {
    public void example() {
        Integer number = 5;
        int primitiveNumber = number;
        System.out.println(number);
        System.out.println(primitiveNumber);
        System.out.println(number.toString());

        String notTrue = "false";
        Boolean notTrueBool = Boolean.parseBoolean(notTrue);
        System.out.println(notTrueBool);

        System.out.println(addNumbers("5", "1"));

        System.out.println(Integer.max(100, 50));

        byte firstNum = 1;
        byte secondNum = 2;
        System.out.println(findMax(firstNum, secondNum));

        Long bigNumber = 10L;
        short smallNumber = bigNumber.shortValue();
        System.out.println(smallNumber);
    }

    public Float addNumbers(String number1, String number2) {
        return Float.parseFloat(number1) + Float.parseFloat(number2);
    }

    public byte findMax(byte firstNumber, byte secondNumber) {
        int firstNumberInt = (int) firstNumber;
        int secondNumberInt = (int) secondNumber;
        Integer firstNumberInteger = firstNumberInt;
        Integer secondNumberInteger = secondNumberInt;
        byte max = (byte) Integer.max(firstNumberInt, secondNumberInt);
        return max;
    }
}
