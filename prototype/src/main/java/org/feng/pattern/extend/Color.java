package org.feng.pattern.extend;

/**
 * 颜色接口
 *
 * @author Feng
 * @date 2020/5/3 14:30
 */
public interface Color extends Cloneable {
    /**
     * 克隆
     * @return 克隆的结果
     */
    Object clone();

    /**展示*/
    void display();
}
