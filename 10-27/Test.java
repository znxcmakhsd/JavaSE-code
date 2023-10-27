import java.util.Scanner;

public class TestDemo {
    public static void main1(String[] args) {
        // 1. 给定一个数字，判定一个数字是否是素数
        // 素数/质数 定义 -> 除了1和该数自身外，无法被其他自然数整除的数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int flag = 0;
        for (i = 2; i < num; i++) {
           if (num % i == 0) {
               break;
           }
           flag = 1;
        }
        if (1 == flag) {
            System.out.println(num+"是素数");
        }else {
            System.out.println(num+"不是素数");
        }
    }

    public static void main2(String[] args) {
        // 2. 打印 1 - 100 之间所有的素数
        int flag = 0;
        int i = 0;
        for (i = 1; i <= 100; i++) {
            int j = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {
        // 3. 编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int i = 0;
        int count = 0;
        for (i = 0; i <= 100; i++) {
            // 判断个位的9
            if (i % 10 == 9) {
                System.out.printf("%d ", i);
            }
            // 判断 十位的9
            if (i / 9 == 9) {
                System.out.printf("%d ", i);
            }
        }
    }
}