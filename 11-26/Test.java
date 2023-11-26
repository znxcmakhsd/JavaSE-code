package demo2;

// 学习异常

class User {
    private String userName;
    private int passWord;

    public User(String userName, int passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void checkLogin() {
        if (!this.userName.equals("admin")) {
            //System.out.println("用户名错误");
            throw new RuntimeException("用户名错误");
        }

        if (this.passWord != 123) {
            System.out.println("密码错误");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // 自定义异常
        User user = new User("admin1",1213);
        user.checkLogin();
    }
    public static void func1() throws NullPointerException {
       /*int[] arr = null;
        System.out.println(arr.length);*/
        throw new NullPointerException();
    }
    // 申明异常 告诉main()方法调用者(JVM) 有个不支持克隆异常 需要你去处理
    // 如果把异常交给JVM处理 它会异常终止程序执行
    public static void main1(String[] args) {
        //func1();
        try {
            func1();

        } catch (NullPointerException e) {
            System.out.println("处理空指针异常");
        }
        System.out.println("不会终止程序");

    }
}
