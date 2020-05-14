package org.feng.pattern.decorator;

/**
 * 装饰器模式的测试运行
 *
 * @author Feng
 * @date 2020/5/14 12:52
 */
public class Client {
    public static void main(String[] args) {
        // 先创建原始组件
        Component component = new ConcreteComponent();
        // 得到装饰器
        AbstractDecorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
