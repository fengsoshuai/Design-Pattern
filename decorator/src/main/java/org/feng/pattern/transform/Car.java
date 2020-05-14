package org.feng.pattern.transform;

/**
 * 汽车：变形金刚的汽车形态
 *
 * @author Feng
 * @date 2020/5/14 13:19
 */
public class Car implements Transform {
    @Override
    public void move() {
        System.out.println("汽车跑");
    }
}
