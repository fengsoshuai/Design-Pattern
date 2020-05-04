package org.feng.pattern.clone;

/**
 * 克隆模式的测试
 *
 * @author Feng
 * @date 2020/5/3 13:23
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDemo demo = new PrototypeDemo();
        Object clone = demo.clone();

        // false
        System.out.println(demo == clone);
        // true
        System.out.println(demo.equals(clone));
        System.out.println(demo.getName() == ((PrototypeDemo)clone).getName());
    }
}
