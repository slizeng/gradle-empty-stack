public class IphoneRobot extends Person {
    public IphoneRobot(String name) {
        super(name);
    }

    @Override
    public void call(String message) throws CannotUseMobileException {
        if (getMobile() instanceof IPhone) {
            super.call(message);
        } else {
            throw new CannotUseMobileException();
        }
    }
}
