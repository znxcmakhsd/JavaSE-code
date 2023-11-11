package demo;

// 3. 理解接口

// 1.1 接口定义
interface IShape {
   void draw();
}
class Circle implements IShape {
    public void draw() {
        System.out.println("画圆");
    }
}
class Triangle implements IShape {
    public void draw() {
        System.out.println("画三角");
    }
}
class Square implements IShape {
    public void draw() {
        System.out.println("画方形");
    }
}

public class Test {


    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.powerOn();
        computer.useDevice(new Mouse());
        computer.useDevice(new Keyboard());
        computer.powerOff();

    }
}
