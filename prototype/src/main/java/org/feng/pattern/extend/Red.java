package org.feng.pattern.extend;

/**
 * 红色
 *
 * @author Feng
 * @date 2020/5/3 14:33
 */
public class Red implements Color {

    @Override
    public Object clone() {
        Object color = null;
        try {
            color = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return color;
    }

    @Override
    public void display() {
        System.out.println("这是红色！");
    }
}
