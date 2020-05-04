package org.feng.pattern.deep;

import java.io.IOException;

/**
 * 深克隆的测试
 *
 * @author Feng
 * @date 2020/5/3 14:02
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeepPrototypeDemo deepPrototypeDemo = new DeepPrototypeDemo("Feng");
        DeepPrototypeDemo deepPrototypeDemo1 = deepPrototypeDemo.deepClone();

        // true
        System.out.println(deepPrototypeDemo.equals(deepPrototypeDemo1));
        // false
        System.out.println((deepPrototypeDemo.getName() == deepPrototypeDemo1.getName()));
        // true
        System.out.println(deepPrototypeDemo.getName().equals(deepPrototypeDemo1.getName()));
    }
}
