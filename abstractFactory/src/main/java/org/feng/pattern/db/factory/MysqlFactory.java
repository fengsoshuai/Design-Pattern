package org.feng.pattern.db.factory;

import org.feng.pattern.db.Connection;
import org.feng.pattern.db.DbFactory;
import org.feng.pattern.db.Statement;
import org.feng.pattern.db.entity.MysqlConnection;
import org.feng.pattern.db.entity.MysqlStatement;


/**
 * MySQL 工厂
 * @author Feng
 */
public class MysqlFactory implements DbFactory {
    @Override
    public Connection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
