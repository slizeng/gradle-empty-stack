public class Person {
    private Mobile mobile;

    public void changeMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void call(String message) {
        mobile.call(message);
    }
}
