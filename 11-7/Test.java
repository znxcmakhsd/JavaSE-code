/*
1. 什么时候会用到继承, 继承解决了什么问题

 *//*

class animal {
    String name;
    int age;

    public void eat() {
        System.out.println(this.name + "正在吃");
    }
}

class Cat {
    String name;
    int age;

   */
/* public void eat() {
        System.out.println("正在吃");
    }*//*

    public void miao() {
        System.out.println("猫叫");
    }
}

class Dog extends animal {
    //String name;
    //int age;

    String color;

   */
/* public void eat() {
        System.out.println("正在吃");
    }*//*


   public void bark() {
        System.out.println("狗叫");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.;
    }
}*/



// 1. 什么是继承 ---》 把多个类的共性抽取出来
// 2. 继承有什么用 ---》 复用代码

/*class animal {
    String name;
    int age;

    public void eat() {
        System.out.println(this.name + "在吃");
    }
}
class Dog extends animal {
    *//*
    String name;
    int age;
    *//*

    String color;

    *//*public void eat() {
        System.out.println(this.name + "在吃");
    }*//*
    public void bark() {
        System.out.println(this.name + "在狗叫");
    }
}

class Cat {
    String name;
    int age;
    String color;

    public void eat() {
        System.out.println(this.name + "在吃");
    }
    public void miao() {
        System.out.println(this.name + "在喵叫");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "abc";
        //dog.bark();
        dog.eat();
    }
}*/

// 3. 子类


