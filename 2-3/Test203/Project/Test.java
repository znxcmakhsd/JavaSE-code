package SE.Test203.Project;

import SE.Test203.Project.book.BookList;
import SE.Test203.Project.user.AdminUser;
import SE.Test203.Project.user.NormalUser;
import SE.Test203.Project.user.User;

import java.util.Scanner;

public class Test {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的名字: ");
        String name = scanner.nextLine();
        System.out.println("输入你的身份: 1.管理员 0.普通用户");
        int status = scanner.nextInt();

        if (1 == status) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        User user =  login();
        while (true) {
            int choose = user.menu();
            user.doOperation(choose,new BookList());
        }
    }
}
