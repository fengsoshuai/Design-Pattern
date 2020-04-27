package org.feng.pattern.button;

/**
 * 抽象按钮工厂
 * @author Feng
 */
public abstract class AbstractButtonFactory {
    /**
     * 获取按钮实例
     * @return AbstractButton
     */
    public abstract AbstractButton getButton();
}
