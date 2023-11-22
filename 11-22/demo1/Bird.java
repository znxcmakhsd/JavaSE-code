package demo1;

public class Bird extends Animal implements IFly,IRun{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " 正在吃鸟粮");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " 正在用两只翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 正在用两只腿跑");
    }
}
