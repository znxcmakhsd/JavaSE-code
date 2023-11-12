package demo4;

// 2. 学习接口的代码


import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    String name;
    int age;

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
        return this.age - o.age;
    }

    /*public int compareTo1(Student o) {
        //return this.name.compareTo(o.name);
        return this.age - o.age;
    }

    public int compareTo2(Student o) {
        return this.name.compareTo(o.name);
        //return this.age - o.age;
    }*/
}

// 灵活比较
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

public class Test {
    public static void main3(String[] args) {

    }


    public static void mySort(Comparable[] comparable) {
        for (int i = 0;i < comparable.length-1;i++) {
            for (int j = 0;j< comparable.length-1-i;j++) {
                if (comparable[j].compareTo(comparable[j+1]) > 0) {
                    Comparable tmp = comparable[j];
                    comparable[j] = comparable[j+1];
                    comparable[j+1] = tmp;
                }
            }
        }
    }
    public static void main2(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("mike",19);
        students[1] = new Student("jack",16);
        students[2] = new Student("andy",13);

        //Arrays.sort(students);
        mySort(students);
        System.out.println(Arrays.toString(students));

    }

    public static void main1(String[] args) {
        Student student1 = new Student("mike",21);
        Student student2 = new Student("jack",20);

        /*if (student1.compareTo2(student2) > 0){
            System.out.println("str1 > str2");
        }else {
            System.out.println("str1 <= str2");
        }*/

        /*if (student1.compareTo(student2) > 0){
            System.out.println("mike age > jack");
        }else {
            System.out.println("mike age <= jack");
        }*/


    }

}
