package org.feng.pattern.transform;

/**
 * 抽象变形装饰器
 *
 * @author Feng
 * @date 2020/5/14 13:19
 */
public abstract class AbstractChanger implements Transform {
    private Transform transform;

    public AbstractChanger(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
