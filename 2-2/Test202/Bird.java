package SE.Test202;

public class Bird extends Animal implements IFly,IRun{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+" 正在用两个翅膀飞！");
    }

    @Override
    public void run() {
        System.out.println(this.name+" 正在用两个小腿腿跑！");
    }

    @Override
    public void eat() {
        System.out.println(this.name+" 正在吃鸟粮...");
    }
}
