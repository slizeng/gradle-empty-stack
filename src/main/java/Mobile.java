import static java.lang.String.format;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message) {
        System.out.print(format("Message : %s", message));
    }

    public void printMobileInfo() {
        System.out.print(format("name: %s, color: %s, brand: %s", name, color, brand));
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
