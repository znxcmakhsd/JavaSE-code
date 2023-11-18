package Operation;

import Book.Book;
import Book.BookList;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
