package Book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.usedSize = 0;
        this.books = new Book[10];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
