package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要借阅书籍名字: ");
        String bookName = scanner.nextLine();

        // 1. 找书
        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(bookName)) {
                 if (false == book.isBorrowed()) {
                     System.out.println("图书借阅成功");
                     book.setBorrowed(true);
                     return;
                 }else {
                     System.out.println("图书已被借阅 借阅失败");
                     return;
                 }
            }
        }
    }
}
