package org.feng.pattern.log.entity;

import org.feng.pattern.log.Log;

/**
 * @author Feng
 */
public class DatabaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("写日志到数据库！");
    }
}
