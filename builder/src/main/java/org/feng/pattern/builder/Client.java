package org.feng.pattern.builder;

import org.feng.pattern.builder.impl.ConcreteBuilder;

/**
 * 建造者的测试
 *
 * @author Feng
 * @date 2020/4/29 12:54
 */
public class Client {
    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();

        System.out.println(product);
    }
}
