import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MobileTest extends UnitTestBasic {
    private String name = "name";
    private String color = "red";
    private String brand = "Nokia";
    private Mobile mobile;

    @Override
    @Before
    public void setUp() {
        super.setUp();
        mobile = new Mobile(name, color, brand);
    }

    @Test
    public void should_has_name_color_and_brand_fields_when_generate_a_mobile() {
        assertThat(mobile.getName(), is(name));
        assertThat(mobile.getColor(), is(color));
        assertThat(mobile.getBrand(), is(brand));
    }

    @Test
    public void should_output_messages_when_use_mobile_to_take_a_call() {
        mobile.call("message content");

        assertThat(systemOut(), is("Message : message content"));
    }

    @Test
    public void should_output_mobile_basic_info_when_invoke_method() {
        mobile.printMobileInfo();

        assertThat(systemOut(), is("name: name, color: red, brand: Nokia"));
    }
}
