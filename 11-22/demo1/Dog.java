package demo1;

public class Dog extends Animal implements IRun,ISwim{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + " 正在4条腿跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + " 正在游泳");
    }
    @Override
    public void eat() {
        System.out.println(this.name + "正在吃狗粮");
    }
}
