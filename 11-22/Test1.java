// 1. 复习 protected关键字

/*class Test2 extends Test {
    // Test2子类继承了 Test父类中的成员变量a
    // Test父类中的成员变量a由protected关键字修饰 表示不同包的子类可以访问父类成员
    public void print() {
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
public class Main {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        //System.out.println(test2.a);
        test2.print();

    }
}*/
import java.util.Arrays;
import java.util.Scanner;

// 1.
/*import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        double average = 0;
        int n1 = 0;
        int n2 = 0;
        // 1. 计算平均值
        for (int i = 0;i < n;i++) {
            double input = scanner.nextDouble();
            arr[i] = input;
            sum += input;
        }
        average = sum/n;
        // 2. 计算高于平均值数据个数
        for (int i = 0;i < n;i++) {
            if (arr[i] > average) {
                n1++;
            }else {
                n2++;
            }
        }
        System.out.printf("%.2f %d %d\n",average,n1,n2);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        double average = 0;
        int n1 = 0;
        int n2 = 0;
        // 1. 计算平均值
        for (int i = 0;i < n;i++) {
            double input = scanner.nextDouble();
            arr[i] = input;
            sum += input;
        }
        average = sum/n;
        // 2. 计算高于平均值数据个数
         for (int i = 0;i < n;i++) {
             if (arr[i] > average) {
                 n1++;
             }else {
                 n2++;
             }
         }
        System.out.printf("%.2f %d %d\n",average,n1,n2);
    }
}*/

// 2. 排序有序数组
/*public class Main {
    public static int removeDuplicates(int[] nums) {
        int prev = 0;
        int cur = 1;
        while (cur < nums.length) {
            if (nums[prev] == nums[cur]) {
                cur++;
            }else {
                prev++;
                nums[prev] = nums[cur];
                cur++;
            }
        }
        return prev;
    }
    public static void main(String[] args) {
        // 1. 输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }
        // 2. 排升序
        Arrays.sort(arr);
        int ret = removeDuplicates(arr);
        for (int i = 0;i <= ret;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

// 3. 删除重复元素
/*public class Main {
    public static void main(String[] args) {
        // 输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }

        int[] numbs = new int[30];
        numbs[0] = arr[0];
        int count = 1;
        for (int i = 1;i < arr.length;i++) {
            int j = 0;
            for (;j < i;j++){
                if (numbs[j] == arr[i]) {
                    break;
                }
            }
            if (j == i) {
                numbs[count] = arr[i];
                count++;
            }
        }
        // 打印
        for (int i = 0;i < count; i++) {
            System.out.print(numbs[i] + " ");
        }
    }
}*/

// 3. 复习接口