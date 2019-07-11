import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest extends UnitTestBasic {

    @Test
    public void should_output_specific_message_when_a_person_makes_a_call_given_a_person_has_iphone() {
        IPhone iPhone = new IPhone("IPhone", "color", "brand");
        Person person = new Person();
        person.changeMobile(iPhone);

        person.call("message");

        assertThat(systemOut(), is("<iPhone>Message : message"));
    }

    @Test
    public void should_output_specific_message_when_a_person_makes_a_call_given_a_person_has_Android() {
        Android android = new Android("Android", "color", "brand");
        Person person = new Person();
        person.changeMobile(android);

        person.call("message");

        assertThat(systemOut(), is("<Android>Message : message"));
    }

}
