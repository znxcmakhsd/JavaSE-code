package demo2;

public class Dog extends Animal implements ISwim,IRun{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用4只狗腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在用4只狗腿游泳");
    }
}
