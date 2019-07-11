import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IPhoneRobotTest extends UnitTestBasic {
    @Test
    public void should_output_target_message_via_iphone_when_IPhoneRobot_takes_a_call_with_iphone() {
        IPhone iPhone = new IPhone("name", "color", "brand");
        IphoneRobot robot = new IphoneRobot("Robot");
        robot.changeMobile(iPhone);

        robot.call("message");

        assertThat(systemOut(), is("<iPhone>Message : message"));
    }

    @Test(expected = CannotUseMobileException.class)
    public void should_throw_cannot_use_this_mobile_exception_when_IPhoneRobot_takes_a_call_without_iphone() {
        Android android = new Android("name", "color", "brand");
        IphoneRobot robot = new IphoneRobot("Robot");
        robot.changeMobile(android);

        robot.call("message");
    }
}
