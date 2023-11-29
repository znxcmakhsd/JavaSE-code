package demo5;

// 1. 泛型 只要会用就行
// 2. 实现一个类，类中包含一个数组成员，使得数组中可以存放任何类型的数据
// 也可以根据成员方法返回数组中某个下标的值？
class MyArray1 {
    public Object[] arr = new Object[10];

    public void setValue(int pos,Object value) {
        arr[pos] = value;
    }

    public Object getValue(int pos) {
        return arr[pos];
    }
}

// 3.
// <T> 表示 myArray2是一个 泛型类
class MyArray2<T> {

    public T[] arr = (T[])new Object[10];

    public void setValue(int pos,T value) {
        arr[pos] = value;
    }

    public T getValue(int pos) {
        return arr[pos];
    }
}
// 4. 正确写法
class MyArray3<T> {

    public Object[] arr = new Object[10];

    public void setValue(int pos,T value) {
        arr[pos] = value;
    }

    public T getValue(int pos) {
        return (T) arr[pos];
    }
}

public class Main {
    public static void main(String[] args) {
        MyArray3<String> myArray = new MyArray3<String>();
        myArray.setValue(0,"ab");
        myArray.setValue(1,"cd");
        myArray.setValue(2,"ed");

        String str = myArray.getValue(1);
        System.out.println(str);

        MyArray3<Integer> myArray2 = new MyArray3<Integer>();
        myArray2.setValue(0,99);
        myArray2.setValue(1,2);
        myArray2.setValue(2,3);

        Integer iin = myArray2.getValue(1);
        System.out.println(iin);
    }
    public static void main2(String[] args) {
        // 3.
        // MyArray2<String> 表示myArray这个对象中的数组只能存储字符串
        MyArray2<String> myArray = new MyArray2<String>();
        myArray.setValue(0,"ab");
        myArray.setValue(1,"cd");
        myArray.setValue(2,"ed");

        String str = myArray.getValue(1);
        System.out.println(str);

        MyArray2<Integer> myArray2 = new MyArray2<Integer>();
        myArray2.setValue(0,99);
        myArray2.setValue(1,2);
        myArray2.setValue(2,3);

        Integer iin = myArray2.getValue(1);
        System.out.println(iin);

    }
    public static void main1(String[] args) {

        // 2. 的确实现了 数组存放任意类型 并可以存取
        // 但是 这样好吗 ?
        MyArray1 myArray = new MyArray1();
        myArray.setValue(0,1);
        myArray.setValue(1,"abc");
        myArray.setValue(2,2.5);

        String str = (String) myArray.getValue(1);
        int x = (int)myArray.getValue(0);
        double y = (double)myArray.getValue(2);

        System.out.println(str);
        System.out.println(x);
        System.out.println(y);

    }
}
