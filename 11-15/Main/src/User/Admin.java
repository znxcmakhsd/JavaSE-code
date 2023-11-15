package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name) {
        super(name);
        this.iOperations = new IOperation[] {
              new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("********* 管理员菜单 *********");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("****************************");
        System.out.println("输入你的操作: ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        return choose;
    }

    @Override
    public void doOperation(int choose,BookList bookList) {
        this.iOperations[choose].work(bookList);
    }
}
