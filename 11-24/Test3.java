package test;

class Identity implements Cloneable {
    public int id = 1;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    public String name;
    public Identity identity;

    public Person(String name) {
        this.name = name;
        this.identity = new Identity();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.identity = (Identity) this.identity.clone();
        return (Object) tmp;
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person1 = new Person("a");
        Person person2 = (Person) person1.clone();
        System.out.println("修改之前:  " + person1.identity.id);
        System.out.println("修改之前: " + person2.identity.id);
        System.out.println("=============================");
        person2.identity.id = 2;
        System.out.println("修改之后:  " + person1.identity.id);
        System.out.println("修改之后: " + person2.identity.id);
    }
    public static void main1(String[] args) throws CloneNotSupportedException{
        Person person1 = new Person("a");
        Person person2 = (Person) person1.clone();
        System.out.println(person2.name);
    }
}
