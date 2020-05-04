package org.feng.pattern.extend;

/**
 * 测试：对克隆模式的扩展版本进行测试
 *
 * @author Feng
 * @date 2020/5/3 14:40
 */
public class Client {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Color red1 = manager.getColor("red");
        Color red2 = manager.getColor("red");

        // 浅克隆的地址：false
        System.out.println(red1 == red2);
        red1.display();
        red2.display();
    }
}
