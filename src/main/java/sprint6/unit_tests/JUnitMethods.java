package sprint6.unit_tests;

import org.junit.Assert;
import org.junit.Test;

public class JUnitMethods {
    public static void main(String[] args) {
        //and many many more methods
        JUnitMethodsTest  jUnitMethodsTest = new JUnitMethodsTest();
        jUnitMethodsTest.shouldBeNull();
        jUnitMethodsTest.shouldNotBeNull();

        //assertTrue assertFalse - check booleans
        //assertThrows - takes the expected Execption and Throwable class' child class

    }
}

class JUnitMethodsTest {
    @Test
    public void shouldBeNull() {
        String nullString = null;
//        String nullString = "laksdjfk";
        Assert.assertNull(nullString);
    }


    @Test
    public void shouldNotBeNull() {
        String nullString = null;
//        String nullString = "laksdjfk";
//        Assert.assertNotEquals(null, nullString);
        Assert.assertNotNull(nullString);
    }


}