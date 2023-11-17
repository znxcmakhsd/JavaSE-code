package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********* 管理员用户 *********");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("****************************");
        System.out.println("输入你的操作: ");
        int input = scanner.nextInt();
        return input;
    }

    public void doOperation(int choose, BookList bookList) {
        this.iOperations[choose].work(bookList);
    }
}
