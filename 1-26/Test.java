package SE.Test126;

// 1.复习static 关键字
/*
public class Test {

    public int a = 1;
    public void test1() {
        System.out.println("test1: 非静态方法");
    }
 
    public static int b = 2;
    public static void test2() {
        System.out.println("test2: 静态方法");
    }

    // 3. 非静态方法中可以使用静态成员
    public void test3() {
        test2();
        System.out.println(b);
    }

    // 4. 但是 静态方法中不能使用非静态成员变量和方法
    public static void test4() {
        // 报错 !
        */
/*System.out.println(this.a);
        this.test1();*//*

    }


    public static void main(String[] args) {
        // 1. 非静态成员方法和变量 需要对象去访问成员变量和方法
        */
/*Test obj = new Test();
        obj.test1();
        System.out.println(obj.a);*//*


        // 2. static修饰的静态成员变量和方法 不需要对象 使用类名 + 点号访问
        */
/*Test.test2();
        System.out.println(Test.b);*//*


        // 3.
        */
/*Test obj = new Test();
        obj.test3();*//*


        // 4.
        //Test.test4();
    }
}
*/

/*class Animal {

}*/

// 
class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println(this.name + "在吃");
    }
}

class Dog {

    public String color;

    public void bark() {
        System.out.println(this.name + "在狗叫");
    }

}

class Cat {

    public String name;
    public int age;

    public void miao() {
        System.out.println(this.name + "在喵叫");
    }

    public void eat() {
        System.out.println(this.name + "在吃");
    }
}

public class Test {
    public static void main(String[] args) {

    }
}

