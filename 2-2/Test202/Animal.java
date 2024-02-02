package SE.Test202;

/*
class Person{

    private String name = "Person";

    int age=0;

}

public class Child extends Person{

    public String grade;

    public static void main(String[] args){

        Person p = new Child();

        //System.out.println(p.name);

    }
}*/

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    //
    public abstract void eat();
}

