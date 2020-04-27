package org.feng.pattern.button;

/**
 * 抽象按钮
 * @author Feng
 */
public abstract class AbstractButton {
    /**
     * 按钮说
     */
    public void say(){
        System.out.println("I am "+this.getClass().getSimpleName() + ".");
    }
}
