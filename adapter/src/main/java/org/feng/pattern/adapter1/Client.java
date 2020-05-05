package org.feng.pattern.adapter1;

/**
 * 类适配器的测试
 *
 * @author Feng
 * @date 2020/5/5 8:38
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
