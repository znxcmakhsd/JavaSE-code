package demo1;

/*
class Dog {
    // 字段 / 属性 / 成员变量
    public String name;
    public int age;

    // 行为 / 成员方法
    public static void bark() {
        System.out.println("汪");
    }
}
public class TestDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        // 3. 访问对象属性与方法
        dog1.age = 10;
        dog1.name = "大黄";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        dog1.bark();
    }
}*/

/*class WashMachine {
    //属性 、 字段 、成员变量：这些成员变量是定义在方法外部 类的内部的
    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double length; // 长
    public double width; // 宽
    public double height; // 高
    public String color; // 颜色

    //成员方法 -> 行为
    public void washClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }

    public void dryClothes(){ // 脱水
        System.out.println("脱水功能");
    }
    public void setTime(){ // 定时
        System.out.println("定时功能");
    }

    public static void main(String[] args) {
        // 使用WashMachine类创建变量
        WashMachine washMachine;
    }
}*/

/*
public class Date {
    public int year;
    public int month;
    public int day;

    // this引用是隐藏参数 可以自己加
    public void setDay(Date this,int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public void printDate(Date this) {
        System.out.println(this.year + "/" + this.month + "/" + this.day);
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();

        // 不能自己传递当前调用方法的对象引用
        // date1.setDay(date1,1,1,1);

        date1.setDay(1,1,1);
        date2.setDay(2,2,2);
        date1.printDate();
        date2.printDate();
    }
}*/

/*class Dog {
    // 字段 / 属性 / 成员变量
    public String name;
    public int age;

    // 行为 / 成员方法
    public static void bark() {
        System.out.println("汪");
    }
}
class TestDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

    }
}*/



/*
public class Date {

    public int year;
    public int month;
    public int day;

    // 默认生成的构造方法
    public Date(){

    }

    // this引用是隐藏参数 可以自己加
    public void setDay(Date this,int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public void printDate(Date this) {
        System.out.println(this.year + "/" + this.month + "/" + this.day);
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        date1.printDate();
    }
}*/

class Date {
    public int year;
    public int month;
    public int day;

    public Date(int y,int m,int d) {
        this.year = y;
        this.month = m;
        this.day =  d;
    }

    public Date() {
        this.year = 1;
        this.month = 1;
        this.day =  1;
    }

    public void print(Date this) {
        System.out.print(this.year + " " + this.month + " " + this.day);
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {

        // 调用带有3个参数的构造方法
        Date date1 = new Date(2,2,2);
        date1.print();

        // 调用带有无参构造
        Date date2 = new Date();
        date2.print();
    }
}