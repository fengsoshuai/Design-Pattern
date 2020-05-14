package org.feng.pattern.decorator;

/**
 * 抽象构件：定义了对象的接口，可以给这些对象动态的增加职责。
 * 是具体构件和抽象装饰类的共同接口。<br>
 *     它声明了在具体构件中实现的业务方法，它的引入可以使客户端以一致的方式处理为被装饰的对象
 *     以及装饰之后的对象，实现客户端的透明操作。
 *
 * @author Feng
 * @date 2020/5/14 12:35
 */
public interface Component {
    /**职责*/
    void operation();
}
