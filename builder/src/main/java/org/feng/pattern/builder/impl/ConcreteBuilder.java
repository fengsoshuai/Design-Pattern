package org.feng.pattern.builder.impl;

import org.feng.pattern.builder.AbstractBuilder;

/**
 * 具体的建造器
 *
 * @author Feng
 * @date 2020/4/29 12:45
 */
public class ConcreteBuilder extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder-A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder-B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder-C");
    }
}
