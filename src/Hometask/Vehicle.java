package Hometask;


public class Vehicle extends Entity implements Actable {
    private String type;

    public Vehicle(String name, String type) {
        super(name);
        this.type = type;
    }
    @Override
    public void describe() {
        System.out.println(type + ": " + name);
    }

    @Override
    public void interact() {
        System.out.println(name + " işə salındı.");
    }

    @Override
    public void performAction() {
        System.out.println(name + " hərəkət edir.");
    }
}