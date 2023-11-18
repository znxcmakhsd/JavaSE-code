package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("输入你要归还图书名字: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        // 1. 判断是否有这本书
        int index = -1;
        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(bookName)) {
                index = i;
            }
        }
        if (-1 == index) {
            System.out.println("没有你要归还的图书名字");
            return;
        }

        Book book = bookList.getBook(index);
       if (book.isBorrowed()) {
           // 归还图书
           System.out.println("归还成功");
           book.setBorrowed(false);

       }else {
           System.out.println("你要归还的书籍尚未借出");
       }
    }
}
