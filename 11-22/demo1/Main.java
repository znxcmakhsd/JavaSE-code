package demo1;

public class Main {
    public static void Func1(IRun iRun) {
        iRun.run();
    }

    public static void main(String[] args) {
        Func1(new Dog("大黄"));
        Func1(new Bird("布谷"));
    }
}
