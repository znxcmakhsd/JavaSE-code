package Operation;

import Book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.exit(0);
    }
}
