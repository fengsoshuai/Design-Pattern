package org.feng.pattern.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理类
 *
 * @author Feng
 * @date 2020/5/3 14:36
 */
public class Manager {
    private static final Map<String, Color> INSTANCES = new HashMap<>(16);

    /**
     * 初始化数据，将对象创建好，当取对象时，取其克隆的对象即可。
     */
    public Manager() {
        INSTANCES.put("red", new Red());
        INSTANCES.put("blue", new Blue());
    }

    public void addColor(String key, Color color){
        INSTANCES.put(key, color);
    }

    public Color getColor(String key){
        return (Color) (INSTANCES.get(key).clone());
    }
}
