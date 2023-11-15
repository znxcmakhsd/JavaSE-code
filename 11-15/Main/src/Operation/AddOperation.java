package Operation;


import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入新增书籍名字: ");
        String bookName = scanner.nextLine();
        System.out.println("输入新增书籍作者: ");
        String author = scanner.nextLine();
        System.out.println("输入新增书籍价格: ");
        int price = scanner.nextInt();
        System.out.println("输入新增书籍类型: ");
        scanner.nextLine();
        String bookType = scanner.nextLine();

        Book newBook = new Book(bookName,author,price,bookType);
        //  检查是否重名
        int bookNum = bookList.getUsedSize();
        for (int i = 0;i < bookNum;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(bookName)) {
                System.out.println("书架上已经有这本书 不可重复新增");
                return;
            }
        }
        // 新增书籍
        bookList.setBook(newBook,bookList.getUsedSize());
        bookList.setUsedSize(bookNum+1);
        // 打印
        new ShowOperation().work(bookList);
    }
}
