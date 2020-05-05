package org.feng.pattern.adapter2;

/**
 * 对象适配器的测试
 *
 * @author Feng
 * @date 2020/5/5 8:47
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
