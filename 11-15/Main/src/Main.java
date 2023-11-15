import Book.BookList;
import Book.Book;
import User.User;
import User.Admin;
import User.NormalUser;
import java.util.Scanner;

public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的名字: ");
        String name = scanner.nextLine();
        System.out.println("输入你的身份: 1.管理员 2.普通用户");
        int choose = scanner.nextInt();
        if (1 == choose) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int input = user.menu();
            user.doOperation(input,bookList);
        }
    }

}