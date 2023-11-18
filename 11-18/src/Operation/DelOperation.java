package Operation;

import Book.BookList;
import Book.Book;
import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("输入你要删除图书名字: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        // 1. 找到删除图书下标
        int index = -1;
        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(bookName)) {
                index = i;
                break;
            }
        }
        if (-1 == index) {
            System.out.println("没有你要删除的图书");
            return;
        }
        // 2. 覆盖删除操作
        for (int i = index;i < bookNum-1 ;i++) {
            Book book = bookList.getBook(i+1);
            bookList.setBooks(book,i);
        }
        bookList.setUsedSize(bookNum-1);
        System.out.println("删除成功");
    }
}
