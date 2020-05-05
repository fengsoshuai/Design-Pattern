package org.feng.pattern.adapter2;

/**
 * 对象适配器：通过引用 Adaptee 的实例对象
 *
 * @author Feng
 * @date 2020/5/5 8:50
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
