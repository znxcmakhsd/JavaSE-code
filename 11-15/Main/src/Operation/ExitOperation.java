package Operation;

import Book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统成功");
        System.exit(0);
    }
}
