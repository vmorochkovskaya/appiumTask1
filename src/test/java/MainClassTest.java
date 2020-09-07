import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expectedNum = 14;
        int actualNum = new MainClass().getLocalNumber();
        Assert.assertEquals("Actual local number isn't equal to expected", expectedNum, actualNum);
    }
}
