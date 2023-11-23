package demo1;

public class Main {

    public static void testIFly(IFly iFly){
        iFly.fly();
    }
    public static void testIRun(IRun iRun){
        iRun.run();
    }
    public static void testISwim(ISwim iSwim){
        iSwim.swim();
    }

    public static void funcFly(){
        Bird bird = new Bird("布谷");
        testIFly(bird);
        System.out.println("--------------------");
    }
    public static void funcSwim(){
        Dog dog = new Dog("大黄");
        Duck frog = new Duck("青蛙");
        testISwim(dog);
        testISwim(frog);
        System.out.println("--------------------");
    }
    public static void funcIRun(){
        Dog dog = new Dog("大黄");
        Duck frog = new Duck("青蛙");
        Bird bird = new Bird("布谷");
        testIRun(dog);
        testIRun(frog);
        testIRun(bird);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        funcFly();
        funcSwim();
        funcIRun();
    }
}
