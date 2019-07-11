import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BasicMobileTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    String systemOut() {
        return outContent.toString();
    }
}
