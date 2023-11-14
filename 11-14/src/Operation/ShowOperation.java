package Operation;

import Book.BookList;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
    }
}
