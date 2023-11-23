/*
import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // 输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }

        int[] count = new int[10];
        for (int i = 1;i <= arr.length;i++) {
            switch (arr[i-1]) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
                case 6:
                    count[5]++;
                    break;
                case 7:
                    count[6]++;
                    break;
                case 8:
                    count[7]++;
                    break;
                case 9:
                    count[8]++;
                    break;
                case 10:
                    count[9]++;
                    break;

            }
        }
        for (int i = 1; i <= 10;i++) {
            System.out.printf("%d: %d\n",i,count[i-1]);
        }
    }
}*/

/*import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // 判断素数
    public static boolean isPrime(int n) {
        int i = 2;
        for (;i < n;i++) {
            if (n % i == 0) {
                break;
            }
        }
        if (i == n) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // 输入
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            arr[i] = scanner.nextInt();
        }

        int cur = 0;
        int prev = 0;
        while (cur < n) {
            if (isPrime(arr[cur])) {
                arr[prev] = arr[cur];
                cur++;
                prev++;
            }else {
                cur++;
            }
        }
        for (int i = 0;i < prev;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        //int[][] arr2 = {{1,2,3},{2,3,4}};
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < 3;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 统计
        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] count = {"","","","","","","","","","","",""};
        for (int i = 1;i <= n;i++) {
            switch (arr[i-1][1]) {
                case 1:
                    month[0] += "*";
                    break;
                case 2:
                    month[1] += "*";
                    break;
                case 3:
                    month[2] += "*";
                    break;
                case 4:
                    month[3] += "*";
                    break;
                case 5:
                    month[4] += "*";
                    break;
                case 6:
                    month[5] += "*";
                    break;
                case 7:
                    month[6] += "*";
                    break;
                case 8:
                    month[7] += "*";
                    break;
                case 9:
                    month[8] += "*";
                    break;
                case 10:
                    month[9] += "*";
                    break;
                case 11:
                    month[10] += "*";
                    break;
                case 12:
                    month[11] += "*";
                    break;
            }
        }
        // 打印
        for (int i = 0;i < 12;i++) {
            System.out.println(month[i]+":"+count[i]);
        }

    }
}*/

