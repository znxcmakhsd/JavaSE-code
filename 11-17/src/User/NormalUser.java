package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new ShowOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********* 普通用户 *********");
        System.out.println("1. 显示图书");
        System.out.println("2. 查找图书");
        System.out.println("3. 借阅图书");
        System.out.println("4. 归还图书");
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
