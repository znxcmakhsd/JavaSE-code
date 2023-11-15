package Operation;

import Book.Book;
import Book.BookList;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("显示图书: ");
        int sz = bookList.getUsedSize();
        for (int i = 0;i < sz;i++) {
            Book book = bookList.retBook(i);
            System.out.println(book.toString());
        }

    }
}
