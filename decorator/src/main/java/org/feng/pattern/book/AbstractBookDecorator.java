package org.feng.pattern.book;

/**
 * 抽象书籍装饰类
 *
 * @author Feng
 * @date 2020/5/14 14:15
 */
public abstract class AbstractBookDecorator extends Book{
    private Book book;

    public AbstractBookDecorator(Book book) {
        this.book = book;
    }
}
