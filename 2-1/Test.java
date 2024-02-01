package SE.Test201;

// 1. 复习多态
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

    // 重写
    @Override
    public void eat() {
        System.out.println(this.name + "正在吃狗粮");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal =  new Dog("旺财",2,"白色");
        animal.eat();
    }
}
*/

/*
class X{
    Y y = new Y();//1
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
        Animal dog = new Dog("小白",2,"白色");
        Animal bird = new Bird("布谷鸟",1);
        func(dog);
        func(bird);
    }
}*/

