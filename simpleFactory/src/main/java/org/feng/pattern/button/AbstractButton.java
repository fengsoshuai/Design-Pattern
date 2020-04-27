package org.feng.pattern.button;

/**
 * 所有按钮的父类：抽象按钮类
 *
 * @see org.feng.pattern.button.impl.DiamondButtonImpl
 * @see org.feng.pattern.button.impl.RoundButtonImpl
 * @see org.feng.pattern.button.impl.RectangleButtonImpl
 * @author Feng
 */
public abstract class AbstractButton {
    /**定义一个说的方法，不同的子类（实现类）有不同的实现*/
    public abstract void say();
}
