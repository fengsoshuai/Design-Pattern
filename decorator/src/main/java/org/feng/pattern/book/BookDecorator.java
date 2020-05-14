package org.feng.pattern.book;

/**
 * TODO
 *
 * @author Feng
 * @date 2020/5/14 14:18
 */
public class BookDecorator extends AbstractBookDecorator {
    public BookDecorator(Book book) {
        super(book);
    }

    /**冻结*/
    public void freeze(){
        System.out.println("冻结！");
    }

    /**遗失*/
    public void lose(){
        System.out.println("遗失！");
    }
}
