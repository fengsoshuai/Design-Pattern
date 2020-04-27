package org.feng.pattern.tv;

import org.feng.pattern.tv.impl.DefaultTv;
import org.feng.pattern.tv.impl.HaierTv;
import org.feng.pattern.tv.impl.HisenseTv;

import java.util.HashMap;
import java.util.Map;

/**
 * 电视工厂：使用Map进行封装
 * @author Feng
 */
public class TvFactory {
    private static final Map<String, Tv> TV_MAP = new HashMap<>(16);

    static {
        TV_MAP.put("haier", new HaierTv());
        TV_MAP.put("hisense", new HisenseTv());
    }

    public static Tv getBean(String name){
        return TV_MAP.getOrDefault(name, new DefaultTv());
    }
}
