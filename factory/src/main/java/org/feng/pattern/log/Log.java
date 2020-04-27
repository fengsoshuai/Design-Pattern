package org.feng.pattern.log;

/**
 * 日志类
 * @author Feng
 */
public interface Log {
    /**
     * 默认实现：文件日志
     */
    default void writeLog(){
        System.out.println("写日志到文件！");
    }
}
