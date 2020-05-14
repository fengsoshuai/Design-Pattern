package org.feng.pattern.book;

/**
 * 书籍测试
 *
 * @author Feng
 * @date 2020/5/14 14:19
 */
public class Client {
    public static void main(String[] args) {
        Book book = new Book();
        BookDecorator bookDecorator = new BookDecorator(book);

        bookDecorator.freeze();
        bookDecorator.lose();
        bookDecorator.borrowBook();
        bookDecorator.returnBook();
    }
}
