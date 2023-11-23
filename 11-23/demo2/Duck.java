package demo2;

public class Duck extends Animal implements IFly,IRun,ISwim {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在用两只鸭翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用两只鸭腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用两只鸭腿游泳");
    }
}
