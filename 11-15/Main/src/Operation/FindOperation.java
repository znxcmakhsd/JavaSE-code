package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要查找图书的名字: ");
        String name = scanner.nextLine();
        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到了这本书 信息如下");
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("没找到");
    }
}
