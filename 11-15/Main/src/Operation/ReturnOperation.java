package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("输入要归还书籍名字: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        // 1. 找书
        int bookNum = bookList.getUsedSize();
        for (int i = 0; i < bookNum; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(bookName)) {
                if (true == book.isBorrowed()) {
                    System.out.println("图书归还成功");
                    book.setBorrowed(false);
                    return;
                }
            }
        }
    }
}
