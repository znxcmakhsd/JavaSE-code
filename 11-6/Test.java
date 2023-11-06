import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        // 1. 数组转字符串
       /* int[] arr = {1,2,3};
        String str = myToString(arr);
        System.out.println(str);*/

        // 2. 数组拷贝
        /*int[] arr = {1,2,3};
        int[] copy = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copy));*/

        // 3. 数组扩容
       /* int[] arr = {1,2,3};
        arr =  Arrays.copyOf(arr,arr.length*2);
        System.out.println(Arrays.toString(arr));*/

        // 4. 指定范围扩容
       /* int[] arr = {1,2,3,4,5};
        int[] copy = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(copy));*/

        // 5. 数组排序
       /* int[] arr = {6,3,5,1,10,2};
        Arrays.sort(arr); // 小 ---> 大
        System.out.println(Arrays.toString(arr));*/

       /* int[] arr = {2,2,1,1,1,2,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);*/

        int[] arr = {1,1,1,3,4,5,7,23,12};
        System.out.println(contiOdd(arr));

    }
    public static boolean contiOdd(int[] arr) {
        int count = 0;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] % 2 != 0) {
                count++;
            } else {
                count = 0;
                continue;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    public static String myToString(int[] arr) {
        // [1,2,3]
        if (arr == null) {
            return "null";
        }
        String ret = "[";
        for (int i = 0;i < arr.length;i++) {
            ret += arr[i];
            if (i < arr.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
}