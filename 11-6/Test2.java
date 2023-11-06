/*
class Value {
    public int a; // int a = 0;
}
public class TestDemo {
    public static void main(String[] args) {
        Value val = new Value();
        System.out.println(val.a);
    }
} */
/*
class Stu {
    private String name;
    int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + "正在吃饭");
        this.sleep();
    }

    //
    private void sleep() {
        System.out.println(this.name + "正在睡觉");
    }
    public String getName() {
        return this.name;
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
}
public class TestDemo {
    public static void main(String[] args) {
        Stu mike = new Stu("mike",18);
       */
/* mike.eat();*//*

        //system.out.println(mike.name);
        */
/*mike.getName();*//*

    }
}*/

/*class Stu {
    private String name;
    public int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return this.name;
    }
    public String getNameCopy() {
        return this.getName();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Stu stu1 = new Stu("mike",18);
        String nameStu1 = stu1.getNameCopy();
        System.out.println(nameStu1);
    }
}*/
/*
class Stu {
    String name;
    int age;
    String classRoom;

    public Stu(String name, int age, String classRoom) {
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Stu stu1 = new Stu("mike",18,"222");
        Stu stu2 = new Stu("andy",19,"222");


    }
}
*/
/*class Student {
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

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student stu1 = new Student("a",18);
        Student stu2 = new Student("b",19);
        stu1.setClassRoom("222");
        stu2.setClassRoom("222");
        System.out.println(Student.classRoom);
    }
}*/



class Stu {
    public String name;
    public int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void eat() {
        System.out.println("正在吃饭");
    }

     public void sleep() {
        System.out.println(this.name + "正在睡觉");
        this.sleep();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Stu stu1 = new Stu("a",18);
        Stu.eat();
    }
}
