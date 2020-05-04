package org.feng.pattern.clone;

import java.util.Objects;

/**
 * 定义要克隆的那个类，实现 Cloneable 接口
 *
 * @author Feng
 * @date 2020/5/3 13:21
 * @see Cloneable
 */
public class PrototypeDemo implements Cloneable {
    private String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrototypeDemo demo = (PrototypeDemo) o;
        return Objects.equals(name, demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
