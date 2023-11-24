package demo2;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 用名字进行比较
        //return this.name.compareTo(o.name);
        // 用年龄进行比较
        return this.age - o.age;
    }
}

// 以年龄排序
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

// 以名字排序
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("a", 20);
        Student student2 = new Student("c", 19);
        Student student3 = new Student("b", 21);

        Student[] students = {student1, student2, student3};

        // 比较器的使用
        AgeComparator ageComparator = new AgeComparator();
        NameComparator nameComparator = new NameComparator();

        System.out.println(ageComparator.compare(student1, student2));
        System.out.println(nameComparator.compare(student1, student2));
        System.out.println("================================");

        // 传入比较器排序
        Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
        System.out.println("================================");
        Arrays.sort(students,nameComparator);
        System.out.println(Arrays.toString(students));
    }

}

    /*public static void my_sort(Comparable[] comparables) {
        for (int i = 0;i < comparables.length;i++) {
            for (int j = 0;j < comparables.length-i-1;j++) {
                if (comparables[j].compareTo(comparables[j+1]) > 0) {
                    Comparable tmp = comparables[j];
                    comparables[j] = comparables[j+1];
                    comparables[j+1] = tmp;
                }
            }
        }
    }*/
   /* public static void main1(String[] args) {
        Student student1 = new Student("a",20);
        Student student2 = new Student("c",19);
        Student student3 = new Student("b",21);
        Comparable[] arr = {student1,student2,student3};
        *//*Arrays.sort(arr);*//*
        my_sort(arr);
        System.out.println(Arrays.toString(arr));
    }*/


