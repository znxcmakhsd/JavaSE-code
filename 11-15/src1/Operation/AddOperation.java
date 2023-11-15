package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增图书操作: ");
        System.out.println("输入书名: ");
        String name = scanner.nextLine();
        System.out.println("输入作者: ");
        String author = scanner.nextLine();
        System.out.println("输入价格: ");
        int price = scanner.nextInt();
        System.out.println("输入书的类型: ");
        String type = scanner.nextLine();

        Book newBook = new Book(name,author,price,type);

        // 判断新增书籍 是否重复
        int sz = bookList.getUsedSize();
        for (int i = 0;i < sz;i++) {
            Book book = bookList.retBook(i);
            if (book.getName().equals(name)) {
                System.out.println("这个书已经有了 不可新增");
                return;
            }
        }
        // 增加书籍
        bookList.setBooks(newBook);

    }
}
