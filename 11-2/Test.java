import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDemo {
    public static void main10(String[] args) {
        int[] nums = {11,2,15,7};
        int target = 9;
        int[] ret = test(nums,target);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] test(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length-i-1; j++) {
                if (nums[i] + nums[j+1] == target) {
                    int sum = nums[i] + nums[j+1];
                    ret[0] = i;
                    ret[1] = j+1;
                    break;
                }
            }
        }
        return ret;
    }
    public static void main9(String[] args) {
        /*
        调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        如数组：[1,2,3,4,5,6]
        调整后可能是：[1, 5, 3, 4, 2, 6]
        */
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
    public static void main8(String[] args) {
        // 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        return ret;
    }
    public static void main7(String[] args) {
        int[] arr = {1,2,3};
        arr = transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
    public static void main6(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main5(String[] args) {
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