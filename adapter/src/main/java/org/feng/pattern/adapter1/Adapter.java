package org.feng.pattern.adapter1;

/**
 * 类适配器：通过继承
 *
 * @author Feng
 * @date 2020/5/5 8:41
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
