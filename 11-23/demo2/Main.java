package demo2;

public class Main {

    public static void funcFly(IFly iFly) {
        iFly.fly();
    }
    public static void funcRun(IRun iRun) {
        iRun.run();
    }
    public static void funcSwim(ISwim iSwim) {
        iSwim.swim();
    }

    public static void testFly() {
        funcFly(new Bird("布谷鸟"));
        funcFly(new Duck("鸭子"));
        System.out.println("***************************");
    }
    public static void testRun() {
       funcRun(new Bird("布谷鸟"));
       funcRun(new Duck("鸭子"));
       funcRun(new Dog("狗子"));
       System.out.println("***************************");
    }
    public static void testSwim() {
        funcSwim(new Duck("鸭子"));
        funcSwim(new Dog("狗子"));
    }


    public static void main(String[] args) {
        testFly();
        testRun();
        testSwim();
    }
}
