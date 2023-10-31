import java.util.Scanner;

public class TestDemo {
    public static void main1(String[] args) {
        int a = 0;
        for (a = 1; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            //外循环(相当于坐标x)：图形总共n行，我们就循环n次
            for (int i = 0; i < n; i++) {
                //内循环(相当于坐标y)结合上一行来看就是第i行第j个
                for (int j = 0; j < n; j++) {
                    //观察过坐标图不难发现*都处于【横纵坐标相等】或者【和等于n-1】时
                    if (i == j || (i + j) == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                //外循环完成一次，代表一行写完，此处换行进行下一次循环
                System.out.println();
            }
        }
    }

    public static void main3(String[] args) {
        // 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        int sum = 0;
        int i = 0;
        int sign = 1;
        for (i = 1; i <= 100; i++) {
            sum += 1 / i * sign;
            sign *= -1;
        }
        System.out.println(sum);
    }

    public static void main4(String[] args) {
        // 输出一个整数的每一位，如：123的每一位是3，2，1
        int n = 123;
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static int max2(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int max3(int x, int y, int z) {
        // 假设x最大
        if (x == max2(x, y) && x == max2(x, z)) {
            return x;
        } else if (y == max2(y, x) && y == max2(y, z)) {
            return y;
        } else  {
            return z;
        }
    }


    public static void main(String[] args) {
        System.out.println(max3(2,3,1));
    }

}