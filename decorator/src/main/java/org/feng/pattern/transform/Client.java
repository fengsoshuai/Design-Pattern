package org.feng.pattern.transform;

/**
 * 变形金刚装饰测试类
 *
 * @author Feng
 * @date 2020/5/14 13:24
 */
public class Client {
    public static void main(String[] args) {
        Transform transform = new Car();
        // 半透明模式
        Airplane airplane = new Airplane(transform);
        airplane.move();
        airplane.fly();

        // 半透明模式
        Robot robot = new Robot(transform);
        robot.move();
        robot.say();

        // 透明模式
        AbstractChanger changer = new Airplane(transform);
        changer.move();
    }
}
