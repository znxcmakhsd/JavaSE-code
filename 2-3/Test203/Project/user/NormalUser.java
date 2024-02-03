package SE.Test203.Project.user;

import SE.Test203.Project.operation.*;

import java.util.Scanner;

public class NormalUser extends User {

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

    @Override
    public int menu() {
        System.out.println("********普通用户菜单********");
        System.out.println("1.显示图书");
        System.out.println("2.查找图书");
        System.out.println("3.借阅图书");
        System.out.println("4.归还图书");
        System.out.println("0.退出系统");
        System.out.println("***************************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}
