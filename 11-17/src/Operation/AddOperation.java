package Operation;

import Book.BookList;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("增加图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要增加的图书名字: ");
        String name = scanner.nextLine();
        System.out.println("输入新增图书作者: ");
        String author = scanner.nextLine();
        System.out.println("输入新增图书价格: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("输入新增图书类型: ");
        String type = scanner.nextLine();

        // 检查是否重名

    }
}
