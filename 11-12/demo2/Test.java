package demo2;

// 1. 学习内部类的代码

/*class OuterClass {
    public int a = 1;
    private int b = 2;
    public static int c = 3;

    *//*static class InerClass {
        public int d = 4;
        private int e = 5;
        public static int f = 6;

        public void test() {
            OuterClass outobj = new OuterClass();
            System.out.println(outobj.a);
            System.out.println(outobj.b);
            System.out.println(outobj.c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
        }
    }*//*

     class InerClass {
        public int d = 1;
        private int e = 2;
        public static final int f = 3;
        public int a = 5;

        public void func() {
            System.out.println(a);
            System.out.println(OuterClass.this.a);
        }

    }

    public void func() {

    }
}*/

/*
public class Test {
    public static void main(String[] args) {

       */
/* OuterClass.InerClass inerClass = new OuterClass.InerClass();
        inerClass.test();*//*


        */
/*OuterClass out = new OuterClass();
        OuterClass.InerClass inner = out.new InerClass();
        inner.func();*//*


        */
/*OuterClass.InerClass inerClass = new OuterClass().new InerClass();
        inerClass.func();*//*


    }
}
*/

interface ITest {
    void func();
}
class A implements ITest {
    public void func() {
        System.out.println("A");
    }
}
public class Test {
    public static void main(String[] args) {
        ITest a = new A();
        ITest b = new ITest() {
           public void func(){
               System.out.println("B");
           }
        };
        a.func();
        b.func();
    }
}


