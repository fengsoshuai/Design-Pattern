package org.feng.pattern.robot;

import java.util.Optional;

/**
 * 仿生机器人测试类
 *
 * @author Feng
 * @date 2020/5/5 9:22
 */
public class Client {
    public static void main(String[] args) {
        Optional<Robot> robotOptional = XmlUtil.getBean();
        if (robotOptional.isPresent()) {
            Robot robot = robotOptional.get();
            robot.cry();
            robot.move();
        }
    }
}
