package demo3;

// 静态内部类

/*
class Outer {
    public int a = 1;
    public static int b = 2;

    // 1. 把静态内部类当作类的成员
    static class innerClass {
        // 3. 内部类中无法直接访问 外部类非静态的成员变量
        public void get() {
            // 因为需要对象的引用
            Outer outer = new Outer();
            System.out.println(outer.a);
            System.out.println(b);
            System.out.println("innerClass::func");
        }
    }
    // 2. 方法2: 实例化静态内部类对象
    public void test() {
        innerClass innerClass = new innerClass();
        innerClass.get();
    }
}

public class Main {
    public static void main(String[] args) {
        // 2. 方法1: 实例化静态内部类对象
        */
/*
        Outer.innerClass innerClass = new Outer.innerClass();
        innerClass.get();
        Outer outer = new Outer();
        outer.test();
        *//*

    }
}*/

// 实例内部类

/*class Outer {
    public int a = 1;
    public static int b = 2;

    // 1. 实例内部类定义
    class innerClass {

        // 2. 实例内部类中不能定义 静态成员变量
        // 因为实例内部类 看作是类的成员 会被对象引用进行调用
        //public static int a = 1;

        // 3. 如果一定要定义 必须加final修饰
        public static final int b = 3;
        public void get() {

            // 5. 指定访问外部类成员
            // 方法1: 外部类对象引用
            Outer outer = new Outer();
            System.out.println(outer.a);

            // 方法2: 外部类.this
            System.out.println(Outer.this.a);
            System.out.println("innerClass::func");
        }
    }
    public void test() {
        innerClass innerClass = new innerClass();
        innerClass.get();
    }
}

public class Main {
    public static void main(String[] args) {
        *//*Outer outer = new Outer();
        outer.test();*//*

        // 4. 实例内部类 实例化对象
        Outer.innerClass innerClass = new Outer().new innerClass();
        innerClass.get();

    }
}*/

// 匿名内部类
/*
interface InterfaceA {
    void fun();
}
class Test implements InterfaceA {
    @Override
    public void fun() {
        System.out.println("test");
    }
}
public class Main {
    public static void main(String[] args) {
        InterfaceA interfaceA  = new InterfaceA() {
            @Override
            public void fun() {
                System.out.println("test2");
            }
        };
        interfaceA.fun();
    }
}
*/





