package org.feng.pattern.transform;

/**
 * 飞机形态
 *
 * @author Feng
 * @date 2020/5/14 13:23
 */
public class Airplane extends AbstractChanger {
    public Airplane(Transform transform) {
        super(transform);
    }

    public void fly(){
        System.out.println("飞呀飞，我的骄傲放纵");
    }
}
