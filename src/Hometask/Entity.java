package Hometask;

abstract class Entity implements Describable {
    String name;


    public Entity(String name) {
        this.name = name;
    }
    public abstract void interact();

}

