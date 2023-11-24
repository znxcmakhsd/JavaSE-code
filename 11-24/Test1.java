package demo2;

import java.util.Arrays;

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

    public int my_compareTo(Student o){
        // 用名字进行比较
        //return this.name.compareTo(o.name);
        // 用年龄进行比较
        return this.age - o.age;
    }

}

public class Main {
    public static void my_sort(Comparable[] comparables) {
        for (int i = 0;i < comparables.length;i++) {
            for (int j = 0;j < comparables.length-i-1;j++) {
                if (comparables[j].compareTo(comparables[j+1]) > 0) {
                    Comparable tmp = comparables[j];
                    comparables[j] = comparables[j+1];
                    comparables[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("a",20);
        Student student2 = new Student("c",19);
        Student student3 = new Student("b",21);
        Comparable[] arr = {student1,student2,student3};
        /*Arrays.sort(arr);*/
        my_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*public static void main1(String[] args) {
        Student student1 = new Student("abc",20);
        Student student2 = new Student("abd",19);

        if (student1.my_compareTo(student2) >= 0) {
            System.out.println("student1 >= student2");
        }else {
            System.out.println("student1 < student2");
        }
    }*/
}
