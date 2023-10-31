public class TestDemo {
    public static void main1(String[] args) {
        int x = 6;
        while (--x > 1) {
            if (x % 2 != 0) {
                System.out.println(x);
            }else {
                int y = 2 * x;
                System.out.println(y);
            }
        }
    }

    public static void main2(String[] args) {
        int count = 0;
        do {
            count = count*2;
            count++;
        }while (count < 10);
        System.out.println(count);
    }

    public static void print(int n) {
        if (n < 10) {
            System.out.println(n % 10);
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }

    public static int sum(int n) {
        // 递归求 1 + 2 + 3 + ... + 10
        if (n == 1)
            return 1;
        int tmp = n + sum(n-1);
        return tmp;
    }
    public static void main(String[] args) {
        //print(123);
        //sum(3);
         
    }
}