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
/*class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println(this.name + "在吃");
    }
}
class Dog extends Animal {

    String color;

    public void bark() {
        System.out.println(this.name + "在狗叫");
    }
}
class Cat extends Animal {

    public void miao() {
        System.out.println(this.name + "在喵叫");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "abc";
        d1.eat();
    }
}*/

/*class Base {
    int a = 1;
    int b = 1;
    public void test() {
        System.out.println("Base::test()");
    }

}
class Derived extends Base {
    public int c = 2;
    public int a = 2;
    public int b = 2;
    public void Method(){
        super.test();
      *//*  System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
        System.out.println(super.a);
        System.out.println(super.b);*//*
    }
    public void test() {
        System.out.println("Base::test()");
    }

}

public class TestDemo {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.Method();
    }
}*/

/*
class Animal {
    public String name;
    public int age;

    // 编译器默认生成
    public Animal() {
        System.out.println("Animal::constructor::test");
    }

    public void eat() {
        System.out.println(this.name + "在吃");
    }
}

class Dog extends Animal {

    String color;

    // 编译器默认生成
    public Dog() {
        super();
        System.out.println("Dog::constructor::test");
    }

    public void bark() {
        System.out.println(this.name + "在狗叫");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}*/

/*
