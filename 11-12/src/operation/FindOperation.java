package operation;

import book.BookList;

public class FindOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("查找图书");
    }
}
