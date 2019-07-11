import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class IphoneTest extends BasicMobileTest {

    @Test
    public void should_output_messages_when_use_mobile_to_take_a_call() {
        Mobile mobile = new IPhone("name", "red", "brand");

        mobile.call("message content");

        assertThat(systemOut(), is("<iPhone>Message : message content"));
    }
}
