package Book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.usedSize = 3;
        this.books = new Book[10];

        this.books[0] = new Book("三国演义","a",10,"小说");
        this.books[1] = new Book("红楼梦","b",20,"小说");
        this.books[2] = new Book("水浒传","c",30,"小说");
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book retBook(int pos) {
        return this.books[pos];
    }

    public void setBooks(Book book) {
        this.books[this.usedSize] = book;
        this.usedSize += 1;
    }
}
