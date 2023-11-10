package com.a.www;

/*import java.util.Scanner;

class Base {

    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Sub extends Base {

    private int z;

    public Sub(int x, int y, int z) {
        //write your code here
        // 子类实例化对象前，必须先把父类进行初始化
        super(x,y); // 调用父类构造方法
        this.z = z;


    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }
}*/
/*class X{
    Y y=new Y();//1
    public X(){//2
        System.out.print("X");
    }
}
class Y{
    public Y(){//3
        System.out.print("Y");
    }
}
public class Z extends X{
    Y y=new Y();//4
    public Z(){//5
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}*/

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "在吃");
    }
}
class Dog extends Animal {

    String color;

    public Dog(String name,int age,String color) {
        super(name,age);
        this.color = color;
    }

    public void bark() {
        System.out.println(this.name + "在狗叫");
    }

    // 2. 重写
    public void eat() {
        System.out.println(this.name + "正在吃狗粮");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄",2,"黄色");
        //Animal animal = new Animal("小白",2);
        /*dog.eat();
        animal.eat();
        dog.bark();*/
        // animal.bark();

        // 1. 理解 向上转型 ---> 父类引用变量 存储子类对象的地址
        Animal animal = new Dog("大黄",2,"黄色");
        animal.eat();


    }
}

// 1. 理解多态前提
//      1.1 理解 向上转型 ---> 父类引用变量 存储子类对象的地址 父类引用 引用子类对象
//      1.2 什么是重写

// 2. 理解多态
// 3. 向上转型的3种方式
//4. 重写详解
