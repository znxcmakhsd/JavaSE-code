package demo1;

// 复习String类

import java.util.Arrays;

class Student {
    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // 14. stringbuilder 可变的
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append("world");
        System.out.println(stringBuilder);

        // 15. StringBuffer

    }
    public static void main13(String[] args) {
        // 13. String

        // 这段代码并不是把world 拼接到s对象中 而是创建了新的对象
        String s = "hello";
        s += " world";
        System.out.println(s);  // 输出：hello world

        // 上面代码 相当于 下面代码 ==========

        String str = "hello";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" world");
        str = stringBuilder.toString();
        System.out.println(str);
    }
    public static void main12(String[] args) {
        // 12. 字符串对象是不可改变的
        String str = "abc";

    }
    public static void main11(String[] args) {
        // 11. 去除字符串左右空格
        String str = "   hello  world   " ;
        System.out.println(str);
        System.out.println(str.trim());
    }
    public static void main10(String[] args) {
        // 10. 字符串截取
        String str = "helloworld";
        String ret1 = str.substring(5);
        System.out.println(ret1);

        String ret2 = str.substring(0,5);
        System.out.println(ret2);
    }
    public static void main9(String[] args) {
        // 9. 字符串拆分
        String str = "www.abc.com";
        String[] ret = str.split("\\.");
        for (int i = 0;i < ret.length;i++) {
            System.out.println(ret[i]);
        }

    }
    public static void main8(String[] args) {
        // 8. 字符/字符串替换
        String str = "abababcac";

        // 替换字符
        // 把字符串中第一个参数的字符 换成第二参数字符
       /* String newStr = str.replace('a','A');
        System.out.println(newStr);*/

        // 替换字符串
        /*String ret = str.replace("ab","AB");
        System.out.println(ret);*/

        // 只替换第一个字符串
        /*String ret2 = str.replaceFirst("ab","AB");
        System.out.println(ret2);*/

    }
    public static void main7(String[] args) {
        // 7. 格式化字符串输出
        String str = String.format("%d-%d-%d",2023,11,25);
        System.out.println(str);
    }
    public static void main6(String[] args) {
        // 6. 字符串大小写转换
        // 小 ——》 大
        String str1 = "abc";
        String ret1 = str1.toUpperCase();
        System.out.println(ret1);

        // 大 ——》 小
        String ret2 = ret1.toLowerCase();
        System.out.println(ret2);
    }
    public static void main5(String[] args) {
        // 5. 字符串常用方法 --- 转化
        // 基本类型 ——》 字符串
       /* String str1 = String.valueOf(123);
        String str2 = String.valueOf(12.3);
        String str3 = String.valueOf(true);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);*/

        // 引用类型 ——》 字符串
        /*String str4 = String.valueOf(new Student("abc",18));
        System.out.println(str4);*/

        // 字符串 ——》 整数
       /* String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(a);*/

        // 字符串 ——》 数组
        String str1 = "abc";
        char[] chars = str1.toCharArray();

        for (char ch:chars) {
           System.out.println(ch);
        }


    }
    public static void main4(String[] args) {
        // 4. 字符串常用方法
        String str1 = new String("abc");
        String str2 = new String("");
        String str3 = new String("abd");
        String str4 = new String("abDdasdDdas");

        // 4.1 - length() 计算 字符串长度
        /*System.out.println(str1.length());
        System.out.println(str2.length());*/

        // 4.2 —— isEmpty() 判断 字符串引用指向的 value字符数组是否有字符元素
        /*System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());*/

        // 4.3 —— equals() 判断 两个字符数组元素 是否相同
        /*System.out.println(str1.equals(str2));*/

        // 4.4 —— compareTo 根据对应字符 比较字符串大小
        /*System.out.println(str1.compareTo(str3));*/

        // 4.5 —— equalsIgnoreCase 忽视英文大小写 比较大小
        /*System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));*/

        // 4.6 —— charAt() 获得字符串某个下标的字符
        /*char ch = str4.charAt(2);
        System.out.println(ch);*/

        // 4.7 —— indexOf() 查找某个字符在字符串中的下标
        /*int index = str4.indexOf('D');
        System.out.println(index);*/

        // 可以指定从哪个位置开始查
        /*int index = str4.indexOf('D',3);
        System.out.println(index);*/

        // 在(主串)字符串中查找（子串）字符串 返回字符串第一次出现的位置 (实现参考C语言 strstr / KMP 算法)
       /* int index = str4.indexOf("asd");
        System.out.println(index);*/


    }
    public static void main3(String[] args) {
        // 3. String类引用 如何存储
        String str1 = new String("abc");

    }
    public static void main2(String[] args) {
        // 2. 3种定义字符串方式
        String str1 = "abc";

        String str2 = new String("def");

        char[] arr = {'g','h','i'};
        String str3 = new String(arr);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
    public static void main1(String[] args) {
        String str = "abc";
        // 1. str是字符串对象的引用 为什么可以直接输出字符串?
        System.out.println(str);
    }
}
