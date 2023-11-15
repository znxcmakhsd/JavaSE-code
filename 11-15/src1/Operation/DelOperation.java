package Operation;

import Book.BookList;

public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("删除图书");
    }
}
