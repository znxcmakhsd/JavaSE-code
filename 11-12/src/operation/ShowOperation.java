package operation;

import book.BookList;

public class ShowOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("显示图书");
    }
}
