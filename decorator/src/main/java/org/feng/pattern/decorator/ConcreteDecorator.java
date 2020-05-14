package org.feng.pattern.decorator;

/**
 *  具体装饰类：
 *  负责向构件中添加新的职责。每一个具体装饰类都定义了一些新的行为，
 *  它可以调用在抽象装饰类中定义的方法，并可以增加新的方法以便扩展对象的行为。
 *
 * @author Feng
 * @date 2020/5/14 12:47
 */
public class ConcreteDecorator extends AbstractDecorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    /**新扩展的行为*/
    private void addBehavior() {
        System.out.println("增加行为了！");
    }
}
