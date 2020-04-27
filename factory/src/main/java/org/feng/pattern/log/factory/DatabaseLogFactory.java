package org.feng.pattern.log.factory;

import org.feng.pattern.log.Log;
import org.feng.pattern.log.LogFactory;
import org.feng.pattern.log.entity.DatabaseLog;

/**
 * 数据库日志工厂类
 * @author Feng
 */
public class DatabaseLogFactory implements LogFactory {
    /**
     * 实现数据库日志
     * @return Log
     */
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
