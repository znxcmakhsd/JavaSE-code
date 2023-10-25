import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.printf("%.2f", num);
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt(); // 50
        int type = sc.nextInt(); // 1
        double price = 0.0;
        int dayPrice = 0;
        // determine if over 24 hour
        if (hours < 24) {
            if (type == 1) {
                price = 1.5;
            }
            else {
                price = 2.5;
            }
            System.out.print("RM ");
            System.out.printf("%.2f", (hours-1) * price);
        }
        else if (hours >= 24) {
            int day = hours / 24; // 2
            int hour = hours % 24; // 2
            if (type == 1) {
                price = 1.5;
                dayPrice = 30;
            }
            else {
                price = 2.5;
                dayPrice = 55;
            }
            System.out.print("RM");
            // 1 * 2.5 + 2*30
            System.out.printf("%.2f", ((hour-1) * price) + (day * dayPrice));
        }
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (18.5 < bmi && bmi < 24.9) {
            System.out.println("Normal");
        }
        else if (25.0 < bmi && bmi < 29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
    public static void main3(String[] args) {
        // 3.
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int times = sc.nextInt();
        switch (no) {
            case 1:
                System.out.print("RM ");
                System.out.printf("%.2f", (7.50*times));
                break;
            case 2:
                System.out.print("RM ");
                System.out.printf("%.2f", (6.99*times));
                break;
            case 3:
                System.out.print("RM ");
                System.out.printf("%.2f", (4.70*times));
                break;
            case 4:
                System.out.print("RM ");
                System.out.printf("%.2f", (5.30*times));
                break;
            case 5:
                System.out.print("RM ");
                System.out.printf("%.2f", (5.99*times));
                break;
            default:
                System.out.print("RM ");
                System.out.printf("%.2f", 0.00);
        }

    }
    public static void main2(String[] args) {
        // 2. deter month
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

    }
    public static void main1(String[] args) {
        // 1. find the max num
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
    /*public static void main(String[] args) {
        *//*System.out.print("\\\"hello\\\"");*//*
       *//* System.out.println(Byte.MAX_VALUE); // 127  - 0111 1111
        // 128 - 1000 0000 ->
        short a = 128;
        byte b = (byte)a;
        System.out.println(b);*//*
 *//*       int a = 3;
        byte b = (byte) a;
        byte c = 1;
        int d = c;*//*

    }*/
    /*public static void main1(String[] args) {
        *//*int number = 5;
        boolean even = (number % 2 == 0);*//*
        int number = 5;
        boolean even;

        if (number % 2 == 0)
            even = true;
        else
            even = false;
        }*/

}