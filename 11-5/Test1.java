

/*class Date {
    public int year;
    public int month;
    public int day;

    public Date(int y,int m,int d) {
        this.year = y;
        this.month = m;
        this.day =  d;
    }
    public Date() {
        *//*this.year = 1;
        this.month = 1;
        this.day =  1;*//*

        // 调用带有3个参数的构造方法
        this(2,2,2);

    }

    public void print(Date this) {
        System.out.print(this.year + " " + this.month + " " + this.day);
        System.out.println();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Date date1 = new Date(2023,11,5);
        Date date2 = new Date();
        //date1.setDate(2023,11,5);
        date1.print();
        date2.print();
    }
}*/

/*class MyValue {
    int value;
}

public class TestDemo {
    public static void main(String[] args) {
        MyValue num1 = new MyValue();
        MyValue num2 = new MyValue();
        num1.value = 1;
        num2.value = 2;
        System.out.printf("交换前 ---> num1 = %d num2 = %d\n",num1.value,num2.value);
        Swap(num1,num2);
        System.out.printf("交换后 ---> num1 = %d num2 = %d\n",num1.value,num2.value);
    }
    public static void Swap(MyValue num1, MyValue num2) {
        int tmp = num1.value;
        num1.value = num2.value;
        num2.value = tmp;
    }

}*/

/*
// 1. 类的定义
class Dog {
    // 字段 / 属性 / 成员变量
    public String name;
    public int age;

    // 行为 / 成员方法
    public static void bark() {
        System.out.println("汪");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        // 2. 类实例化对象
        Dog d1 = new Dog();

        // 3. 访问对象属性与方法
        d1.age = 10;
        d1.name = "大黄";

        System.out.println(d1.name);
        System.out.println(d1.age);
        d1.bark();
    }
}*/

/*
import java.util.Arrays;
public class TestDemo {
    public static void main(String[] args) {
       int[][] arr = new int[2][];
       arr[0] = new int[]{1,2,3};
       arr[1] = new int[]{1,2,3,4,5};
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }
}*/

/*
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        test(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void test(int[] arr) {
        arr[0] = 5;
    }
}
*/


/*public class TestDemo {
    public static void func() {
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;

        int[] array2 = new int[]{1,2,3,4,5};
        array2[0] = 100;
        array2[1] = 200;

        array1 = array2;
        array1[2] = 300;
        array1[3] = 400;
        array2[4] = 500;
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    public static void main(String[] args) {
        func();
    }
}*/

/*public class TestDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int a = 10;
    }
}*/

/*
import java.util.Arrays;
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        */
/*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*//*

        */
/*for (int x : arr) {
            System.out.print(x + " ");
        }*//*


        String str = Arrays.toString(arr);
        System.out.println(str);

    }
}


*/
/*public class TestDemo {
    public static void main(String[] args) {
        int[] arr2 = new int[]{1,2,3};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}*//*

*/
/*

    public static void main1(String[] args) {
        // 1. 写一个递归方法，输入一个非负整数，返回组成它的数字之和
        int n = 12345;
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n < 10) {
            return n % 10;
        }
        int ret = 0;
        return ret = n % 10 + sum(n/10);
    }*/

