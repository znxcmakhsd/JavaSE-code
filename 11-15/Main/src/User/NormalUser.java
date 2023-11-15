package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    @Override
    public int menu() {
        System.out.println("********* 普通用户菜单 *********");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("****************************");
        System.out.println("输入你的操作: ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        return choose;
    }

    @Override
    public void doOperation(int input, BookList bookList) {
        this.iOperations[input].work(bookList);
    }
}
