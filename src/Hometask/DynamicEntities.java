package Hometask;

// DynamicEntities.java
public class DynamicEntities {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("BMW X5", "Avtomobil");

        Person person1 = new Person("Cavanshir", 18);

        Device device1 = new Device("Smartfon");

        System.out.println("---");
        person1.describe();
        person1.interact();
        person1.performAction();
        System.out.println();
        System.out.println("---");
        vehicle1.describe();
        vehicle1.interact();
        vehicle1.performAction();
        System.out.println();
        System.out.println("---");
        device1.describe();
        device1.interact();
        device1.performAction();
        device1.interact();
        System.out.println();
    }
}