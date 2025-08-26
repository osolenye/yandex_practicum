package sprint6.unit_tests;

import org.junit.Assert;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class JUnitFramework {
    public static void main(String[] args) {
        // to understand how JUnit works make a test myself:
        JUnitFramework jUnitFramework = new JUnitFramework();
        System.out.println(jUnitFramework.sumAfterDiscount(1000));

        //test case consists of: preparation, execution and checking

        // using the test class for a function
        DiscountCalculatorTest discountCalculatorTest = new DiscountCalculatorTest();
//        discountCalculatorTest.shouldGiveNoDiscountForValue999();

        // framework can use your code in it's work, while librarie's code is used in your code for it to run
        discountCalculatorTest.shouldGiveNoDiscountForValue999JUnit();
    }

    int sumAfterDiscount(int sum) {
//        if (sum < 1000) {
//            return sum;
//        } else {
//            return (int) (sum * 0.98);
//        }
        return 10000;
    }
}

// self made testing class
class TestLibrary {
    public static <T> void assertEquals(T expected, T actual) {
        if (!expected.equals(actual)) {
            throw new RuntimeException("Expected " + expected + " but got " + actual);
        }
    }
}

// a class that will test our Discount class
class DiscountCalculatorTest {
    JUnitFramework jUnitFramework = new JUnitFramework();

    // old implementation that i've done without JUnit framework
    public void shouldGiveNoDiscountForValue999() {
        // preparation
        int buySum = 999;
        int expectedSum = 999;

        // execution
        int resultSum = jUnitFramework.sumAfterDiscount(buySum);

        // checking
        TestLibrary.assertEquals(expectedSum, resultSum);
    }

    // new implementation using JUnit
    @Test //special annotation in JUnit code base that tells the compiler that it's a testing function
    public void shouldGiveNoDiscountForValue999JUnit() {
        // preparation
        int buySum = 999;
        int expectedSum = 999;

        // execution
        int resultSum = jUnitFramework.sumAfterDiscount(buySum);

        Assert.assertEquals(expectedSum, resultSum);
    }
}