package Hometask;


public class Device extends Entity implements Actable {
    private boolean isOn;

    public Device(String name) {
        super(name);
        this.isOn = false; // Başlanğıcda false
    }
    @Override
    public void describe() {
        System.out.println("Cihaz: " + name);
    }
    @Override
    public void interact() {
        if (isOn) {
            isOn = false;
            System.out.println(name + " bağlandı.");
        } else {
            isOn = true;
            System.out.println(name + " açıldı.");
        }
    }
    @Override
    public void performAction() {
        System.out.println(name + " funksiyasını yerinə yetirir.");
    }
}