public class IPhone extends Mobile {
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        System.out.print(String.format("<iPhone>Message : %s", message));
    }
}
