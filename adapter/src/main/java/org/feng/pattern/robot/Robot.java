package org.feng.pattern.robot;

/**
 * 机器人
 *
 * @author Feng
 * @date 2020/5/5 9:00
 */
public interface Robot {
    /**喊叫*/
    default void cry(){
        System.out.println("默认：机器人喊叫！");
    }
    /**移动*/
    default void move(){
        System.out.println("默认：机器人移动！");
    }
}
