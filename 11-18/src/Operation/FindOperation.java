package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("输入你要查找图书的名字: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(bookName)) {
                System.out.println("找到了");
                System.out.println("这本书信息如下: ");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到图书");
    }
}
