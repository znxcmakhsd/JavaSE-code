package demo1;

public class Duck extends Animal implements IRun,ISwim,IFly{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用两只鸭腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用两只鸭腿游泳");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在用两只鸭翅膀游泳");
    }
}
