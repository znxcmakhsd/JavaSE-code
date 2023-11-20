/*
class Date {
    private int year = 1;
    private int month = 1;
    private int day = 1;

    public Date(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void get() {
        System.out.println(this.year);
        System.out.println(this.month);
        System.out.println(this.day);
    }
}

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2,2,2);
        date.get();
    }
}*/
class Animal {
    private String name;
    private int age;
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
class Dog extends Animal{

    public Dog(String name,int age) {
        super(name,age);
    }

}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("a",1);
        //System.out.println();
        //dog.init("a",1);
        System.out.println(dog.getName());
    }
}

