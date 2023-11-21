// 1. 复习代码块 
// 测试 静态代码块
class Student {
    private static String classRoom;
    private String name;
    private int age;

    // 静态
    static {
        // 静态代码块中 不能给 普通成员变量初始化
        classRoom = "1";
        System.out.println("静态代码块 执行了");
        //age = 1;
    }

    // 实例
    {
        // 实例代码块中 可以为静态成员进行初始化
        name = "abc";
        //classRoom = "1";
        System.out.println("实例/构造 代码块执行了");
    }

    //
    public Student() {
        System.out.println("构造函数 执行了");
    }
}



public class Main {
    public static void main(String[] args) {
        /*Student stu1 = new Student();
        System.out.println(stu1);*/
        Test test = new Test();
        System.out.println(test.a);

    }
}

// 2. 复习protected 关键字 
package a.b;

import a.Test;

class Test2 extends Test{
    public void func() {
        // 只能使用 super. 访问protected修饰的父类成员
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        // super不能在 静态方法中使用
        Test2 test2 = new Test2();
        test2.func();
    }
