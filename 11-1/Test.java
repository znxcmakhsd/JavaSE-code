import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        // 写一个递归方法，输入一个非负整数，返回组成它的数字之和
        int n = 1234;
        System.out.println(add(n));
    }
    public static int add(int n) {
        // 1234
        // 1234 -> 123 -> 12 -> 1
        if (n < 10) {
            return n % 10;
        }
        int res = add(n / 10);
        return res;
    }
    public static void main7(String[] args) {
        // 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）
        int n = 1234;
        print(n);
    }
    public static void print(int n) {
        // 1 2 3 4
        // 1234 -> 123 -> 12 -> 1
        if (n < 10) {
            System.out.println(n % 10);
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }

    public static void main6(String[] args) {
    // 递归求 1 + 2 + 3 + ... + 10s
        System.out.println(sum(10));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int ret = n + sum(n - 1);
        return ret;
    }

    public static void main5(String[] args) {
        // 递归求 N 的阶乘
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n) {
        // 5 * 4 * 3 * 2 * 1
        if (n == 1) {
            return 1;
        }
        int ret = n * fac(n-1);
        return ret;
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int[] stEachStu = new int[n]; // 存储 每个学生的quiz + assign + fianl exam
        int[] recLevel = new int[6]; // 存储每个级别的人数
        char[] sign = {'A','B','C','D','E','F'};

        // 输入
        for (int i = 0; i < n; i++) {
            int grade = 0;
            for (int j = 0; j < 3; j++) {
                int tmp = sc.nextInt();
                grade += tmp;
            }
            stEachStu[i] = grade;
        }

        // 计算 每个级别的人数 和 均分
        int[] numLevel = new int[n];
        double[] eachGrade = new double[n];
        for (int i = 0; i < 6; i++) {
            if (stEachStu[i] >= 90 && stEachStu[i] <= 100) {
                numLevel[0] += 1;
                eachGrade[0] += stEachStu[0];
            } else if (stEachStu[i] >= 80 && stEachStu[i] <= 89) {
                numLevel[1] += 1;
                eachGrade[1] += stEachStu[1];
            } else if (stEachStu[i] >= 70 && stEachStu[i] <= 79) {
                numLevel[2] += 1;
                eachGrade[2] += stEachStu[2];
            } else if (stEachStu[i] >= 60 && stEachStu[i] <= 79) {
                numLevel[3] += 1;
                eachGrade[3] += stEachStu[3];
            } else if (stEachStu[i] >= 50 && stEachStu[i] <= 59) {
                numLevel[4] += 1;
                eachGrade[4] += stEachStu[4];
            } else {
                numLevel[5] += 1;
                eachGrade[5] += stEachStu[5];
            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Grade %c: %d student(s)\n", sign[i],numLevel[i]);
            System.out.printf("Average Mark of Grade: %.1f\n\n",eachGrade[i]/numLevel[i]);
        }
        System.out.printf("Grade F: %d student(s)\n", numLevel[5]);
        System.out.printf("Average Mark of Grade: %.1f\n\n",eachGrade[5]/numLevel[5]);


    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int heaSack = 0;
       /* while (sc.hasNextInt()) {
            int tmp = sc.nextInt();
            sum += tmp;
            count++;
        }*/
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();
            if (tmp > heaSack) {
                heaSack = tmp;
            }
            sum += tmp;
            count++;
        }
        System.out.println("Total kg of flour : " + sum);
        System.out.printf("Average kg of flour : %.2f",sum / count);
        System.out.printf("Average kg of flour : %dkg",heaSack);

    }
}