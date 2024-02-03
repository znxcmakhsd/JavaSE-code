package SE.Test203.Project.book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.books = new Book[10];
        this.usedSize = 0;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
