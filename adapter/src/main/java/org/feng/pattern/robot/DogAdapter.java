package org.feng.pattern.robot;

/**
 * 狗的适配
 *
 * @author Feng
 * @date 2020/5/5 9:14
 */
public class DogAdapter extends Dog implements Robot{
    @Override
    public void cry() {
        System.out.println("机器人模仿：");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模仿：");
        super.run();
    }
}
