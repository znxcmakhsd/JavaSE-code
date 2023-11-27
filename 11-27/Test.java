package demo1;

public class Main {
    public static void main(String[] args) {
        // 4. 一道关于包装类的阿里面试题
        // 11-22 1:50
        Integer a = 100;
        Integer b = Integer.valueOf(100);
        System.out.println(a == b);

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
    }
    public static void main2(String[] args) {
        // 3. 如何做到的 ?
        int a = 1;
        //Integer in = a; // 自动装箱
        // ========
        Integer in = Integer.valueOf(a); // 手动装箱
        System.out.println(in);

        Integer iin = new Integer(123);
        int b = iin.intValue(); // 手动拆箱
        System.out.println(b);

        double c = iin.doubleValue();
        System.out.println(c);

    }
    public static void main1(String[] args) {
        // 1. 基本类型 ——》 包装类  - 装箱
        int a = 1;
        Integer in = a; // 自动装箱

        // 2. 包装类 ——》 基本类型 - 拆箱
        Integer iin = new Integer(2);
        int b = iin; // 自动拆箱
        System.out.println(in);
        System.out.println(b);

    }
}