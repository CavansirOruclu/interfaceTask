package Hometask;


public class Person extends Entity implements Actable {
    private int age;

    public Person(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void describe() {
        System.out.println(name + " (" + age + ")");
    }
    @Override
    public void interact() {
        System.out.println(name + " salamlaşır.");
    }
    @Override
    public void performAction() {
        System.out.println(name + " öyrənir.");
    }
}