package org.feng.pattern.decorator;

/**
 * 具体构件：
 * 定义了具体的构件对象，实现了在抽象构件中声明的方法，装饰器可以给它增加额外的职责。
 *
 * @author Feng
 * @date 2020/5/14 12:39
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent...operation()");
    }
}
