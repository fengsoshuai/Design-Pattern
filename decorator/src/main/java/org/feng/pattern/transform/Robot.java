package org.feng.pattern.transform;

/**
 * 机器人形态
 *
 * @author Feng
 * @date 2020/5/14 13:21
 */
public class Robot extends AbstractChanger {
    public Robot(Transform transform) {
        super(transform);
    }

    public void say(){
        System.out.println("机器人会说话！");
    }
}
