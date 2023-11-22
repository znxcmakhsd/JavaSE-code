package demo1;

abstract public class Animal {
    public String name;

    public  Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
}
