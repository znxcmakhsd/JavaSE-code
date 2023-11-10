package com.a.www;
/*
class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // final 修饰
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
        // 将一个子类对象向上转型后 再无法调用子类的方法 这时候就需要对父类引用 进行向下转型
        Animal dog = new Dog("小白",2,"白色");
        Dog d1 = (Dog)dog;
        d1.barks();
    }
}*/

class Shape {
    public void draw() {
        System.out.println("画图形");
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("圆型");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("方形");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("三角形");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape cir = new Circle();
        Shape tri = new Triangle();
        Shape squ = new Square(); 
        drawMap(cir);
        drawMap(tri);
        drawMap(squ);
    }
}







