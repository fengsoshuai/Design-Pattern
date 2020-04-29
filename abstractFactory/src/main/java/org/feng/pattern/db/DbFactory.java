package org.feng.pattern.db;

/**
 * 数据库抽象工厂
 * @author Feng
 */
public interface DbFactory {

    /**
     * 获取连接对象
     * @return Connection
     */
    Connection createConnection();

    /**
     * 获取语句对象
     * @return Statement
     */
    Statement createStatement();
}
