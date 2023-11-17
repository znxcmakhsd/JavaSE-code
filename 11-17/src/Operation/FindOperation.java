package Operation;

import Book.BookList;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
    }
}
