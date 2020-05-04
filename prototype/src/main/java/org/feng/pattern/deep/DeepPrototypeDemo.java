package org.feng.pattern.deep;

import java.io.*;
import java.util.Objects;

/**
 * 深克隆的实现：使用序列化
 *
 * @author Feng
 * @date 2020/5/3 13:56
 */
public class DeepPrototypeDemo implements Serializable {
    private static final long serialVersionUID = -7788867131779264434L;
    private String name;

    public DeepPrototypeDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeepPrototypeDemo that = (DeepPrototypeDemo) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * 深度克隆
     * @return 克隆的结果
     */
    public DeepPrototypeDemo deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中读出
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (DeepPrototypeDemo) ois.readObject();
    }
}
