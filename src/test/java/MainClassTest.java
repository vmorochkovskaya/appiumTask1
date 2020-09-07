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

}
