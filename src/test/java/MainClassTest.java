import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expectedNum = 14;
        int actualNum = new MainClass().getLocalNumber();
        Assert.assertEquals("Actual local number isn't equal to expected", expectedNum, actualNum);
    }

    @Test
    public void testGetClassNumber() {
        int numForComparison = 45;
        int actualNum = new MainClass().getClassNumber();
        Assert.assertTrue(String.format("Actual class number %1$s isn't greater than %2$s", actualNum, numForComparison),
                actualNum > numForComparison);
    }

    @Test
    public void testGetClassString() {
        String expectedSubStringLower = "hello";
        String expectedSubStringCap = "Hello";
        String actualString = new MainClass().getClassString();
        Assert.assertTrue(String.format("Actual class string %1$s doesn't contain %2$s or %3$s", actualString, expectedSubStringLower, expectedSubStringCap),
                actualString.contains(expectedSubStringLower) || actualString.contains(expectedSubStringCap));
    }
}
