package demo5;

// 1. 泛型 只要会用就行
// 2. 实现一个类，类中包含一个数组成员，使得数组中可以存放任何类型的数据
// 也可以根据成员方法返回数组中某个下标的值？
class MyArray {
    public Object[] arr = new Object[10];

    public void setValue(int pos,Object value) {
        arr[pos] = value;
    }

    public Object getValue(int pos) {
        return arr[pos];
    }
}
public class Main {
    public static void main(String[] args) {

        // 的确实现了 数组存放任意类型 并可以存取
        // 但是 这样好吗 ?
        MyArray myArray = new MyArray();
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
