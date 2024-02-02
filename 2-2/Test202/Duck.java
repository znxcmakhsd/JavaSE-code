package SE.Test202;

public class Duck extends Animal implements IFly,IRun,ISwim{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name+" 正在吃鸭粮...");
    }

    @Override
    public void fly() {
        System.out.println(this.name+" 正在用翅膀飞...");
    }

    @Override
    public void run() {
        System.out.println(this.name+" 正在用鸭腿跑...");
    }

    @Override
    public void swim() {
        System.out.println(this.name+" 正在用鸭腿游泳...");
    }
}
