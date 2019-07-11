public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name) {
        this.name = name;
    }

    public void changeMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void call(String message) throws CannotUseMobileException {
        mobile.call(message);
    }

    public String getName() {
        return name;
    }

    public Mobile getMobile() {
        return mobile;
    }
}
