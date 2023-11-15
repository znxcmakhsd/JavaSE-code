package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        new ShowOperation().work(bookList);

        System.out.println("输入你要删除图书的名字: ");
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
            System.out.println("你要删除的图书 不在书架中 删除失败");
            return;
        }
        // 2. 进行覆盖删除
        for (int i = index;i < bookList.getUsedSize()-1;i++) {
            Book tmp = bookList.getBook(i+1);
            bookList.setBook(tmp,i);
        }
        bookList.setBook(null,bookNum-1);
        bookList.setUsedSize(bookNum-1);


    }
}
