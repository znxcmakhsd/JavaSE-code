package demo1;

public class Main {
    public static void main(String[] args) {
        // 2. 包装类 阿里面试题
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        System.out.println(a == b);

        Integer c = Integer.valueOf(200);
        System.out.println(a == c);
        // 为什么 a==b -> true ||| a==c -> false ?
        // 因为valueof这个方法会根据传入的数据大小 创建对象
        // 如果传入的数在 [-128 - 127] 返回IntegerCache.cache[]缓存数组中对象元素
        // 除外 创建新对象
    }
    public static void main1(String[] args) {
        // 1. 装箱/拆箱

        // 装箱: 基本类型 ——》 包装类
        Integer a = 1; // 自动装箱

        // 拆箱: 包装类 ——》 基本类型
        Integer in = new Integer(2);
        int b = in; // 自动拆箱
        System.out.println(a+ " "+ b);

        // 2. 装箱和拆箱的原理是什么 ？
        Integer c = Integer.valueOf(3);
        // === Integer a = 1 执行这段代码 会自动调用Integer的valueof方法 ——》 java 提供了自动机制 为了减少开发者的负担
        System.out.println(c);

        Integer d = Integer.valueOf(4);
        // 手动拆箱
        int e = d.intValue(); // ====== int b = in;  调用Integer的intValue方法实现拆箱
        System.out.println(e);
    }
}
