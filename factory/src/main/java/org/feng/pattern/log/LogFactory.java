package org.feng.pattern.log;

import org.feng.pattern.log.entity.FileLog;

/**
 * 日志工厂
 * @author Feng
 */
public interface LogFactory {
    /**
     * 默认实现：文件日志
     * @return Log
     */
    default Log createLog(){
        return new FileLog();
    }
}
