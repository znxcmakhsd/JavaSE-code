package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        // 找书
        System.out.println("借阅图书: ");
        System.out.println("输入你要借阅的书籍名字: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int bookNum = bookList.getUsedSize();
        int index = -1;
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                index = i;
            }
        }

        if (-1 == index) {
            System.out.println("没有你要查阅的书籍: ");
            return;
        }
        Book book = bookList.getBook(index);
        if (book.isBorrowed()) {
            System.out.println("这本书已经借出");
            return;
        } else {
            System.out.println("借阅成功");
            book.setBorrowed(true);
            System.out.println(book);
        }
    }
}
