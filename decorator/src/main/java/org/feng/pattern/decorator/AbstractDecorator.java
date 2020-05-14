package org.feng.pattern.decorator;

/**
 * 抽象装饰类：
 * 抽象构件接口的实现类，用于给具体的构件增加职责，但是具体职责在其子类中实现。<br>
 * 它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，
 * 并通过其子类扩展该方法以达到装饰的目的。
 *
 * @author Feng
 * @date 2020/5/14 12:41
 */
public abstract class AbstractDecorator implements Component{
    private Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
