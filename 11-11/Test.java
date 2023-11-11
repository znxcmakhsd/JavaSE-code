// 1. 总结 向下转型
/*
class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(this.name + "正在吃");
    }
}
class Dog extends Animal {
    public String  color;

    public Dog(String name,int age, String color) {
        super(name,age);
        this.color = color;
    }
    public void barks() {
        System.out.println(this.name + "正在狗叫");
    }
    public void eat() {
        System.out.println(this.name + " 正在吃狗粮");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(this.name + " 正在吃鸟粮");
    }
}
public class TestDemo {
    public static void func(Animal animal) {
        animal.eat();
    }
    public static void main(String[] args) {
        Animal animal = new Dog("小白",2,"白色");
        Dog dog = (Dog)animal;
        dog.barks();
    }
}*/

// 2. 总结抽象类
// 抽象类
/*abstract class Shape {
    public abstract void draw();
}

abstract class Circle extends Shape {
    public abstract void drawCircle();
}
class B extends Circle {
    public void drawCircle() {

    }
    public void draw() {

    }
}*/


/*
class Triangle extends Shape {
    public void draw() {
        System.out.println("画三角");
    }
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("画方形");
    }
}
*/

/*
public class TestDemo {
    public static void func(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
       //Shape shape = new Shape();

    }
}
*/

/*abstract class Person {
    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    public Student(String name,int age) {
        super(name,age);
    }
    public void print() {
        System.out.println(this.name + " " + this.age);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student stu = new Student("小白",18);
        stu.print();
    }
}*/

// 3. 总结接口

public class TestDemo {
    public static void main(String[] args) {

    }
}
