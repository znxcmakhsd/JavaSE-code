import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDemo {
    public static void main5(String[] args) {
        // 9.
    }
    public static void main(String[] args) {
        // 8. 数组拷贝 + 扩容 + 指定位置拷贝
        int[] arr = {1,2,3};
        //int[] copyArr = Arrays.copyOf(arr,arr.length*2);
        //System.out.println(Arrays.toString(copyArr));
        int[] dest =  new int[arr.length];
        System.arraycopy(arr,0 ,dest,0,arr.length);
        System.out.println(Arrays.toString(dest));


    }
    public static void main2(String[] args) {
        // 7. 模拟实现 toSring
        int[] arr = {1,2,3,4,5};
        String ret = myToString(arr);
        System.out.println(ret);
    }
    public static String myToString(int[] arr) {
        // [1,2,3,4,5];
        if (arr == null) {
            return "null";
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i < arr.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main1(String[] args) {
        // 1. 数组的初始化
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[]{1,2,3,4};
        int[] arr3 = new int[4];
        // 2. 引用变量是如何存储的
        // 3. 空指针异常
        int[] arr4 = null;
        //4. 3种 数组遍历
        // 5. 引用变量 -> 引用 - 存储地址的变量
        // 6. 数组传参 -> 传值 （地址和数）
    }
}