package User;

import Book.BookList;
import Operation.IOperation;

public abstract class User {
    private String name;
    protected IOperation[] iOperations;

    public User(String name) {

        this.name = name;
    }
    public abstract int menu();

    public abstract void doOperation(int choose, BookList bookList);
}
