package User;

import Book.BookList;
import Operation.IOperation;

abstract public class User {
    private String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public abstract void doOperation(int input,BookList bookList);
}
