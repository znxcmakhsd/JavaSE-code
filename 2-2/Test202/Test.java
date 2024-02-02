package SE.Test202;

public class Test {
    public static void fun1(Animal animal) {
        animal.eat();
    }

    public static void func2(IRun iRun) {
        iRun.run();
    }

    public static void main(String[] args) {
       /* fun1(new Dog("大黄"));
        fun1(new Bird("布谷"));*/

        func2(new Dog("大黄"));
        func2(new Duck("唐老鸭"));

    }
}
