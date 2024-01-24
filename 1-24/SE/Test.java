package SE;

/*
class Student {

    private String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void eat() {
        System.out.println(this.name + "正在吃饭");
    }

}
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("小白",19);
        Student student2 = new Student("小明",20);
        // private修饰的成员变量和方法 无法在类外访问
        //student1.eat();
        //System.out.println(student1.name);
    }
}
*/

class Student {
    private String name;
    private int age;
    public static String classRoom;//上课的教室

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassRoom() {
        return classRoom;
    }
}


public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("a",18);
        Student stu2 = new Student("b",19);


    }
}

