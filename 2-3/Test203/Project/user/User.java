package SE.Test203.Project.user;

import SE.Test203.Project.book.BookList;
import SE.Test203.Project.operation.IOperation;

public abstract class User {

    private String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choose, BookList bookList) {
        this.iOperations[choose].work();
    }
}
