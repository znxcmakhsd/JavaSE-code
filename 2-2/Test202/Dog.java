package SE.Test202;

public class Dog extends Animal implements ISwim,IRun{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+" 正在用4条腿游泳！");
    }

    @Override
    public void run() {
        System.out.println(this.name+" 正在用4条腿跑！");
    }

    @Override
    public void eat() {
        System.out.println(this.name+" 正在吃狗粮...");
    }
}
