package org.feng.pattern.db.factory;

import org.feng.pattern.db.Connection;
import org.feng.pattern.db.DbFactory;
import org.feng.pattern.db.Statement;
import org.feng.pattern.db.entity.OracleConnection;
import org.feng.pattern.db.entity.OracleStatement;


/**
 * Oracle 工厂
 * @author Feng
 */
public class OracleFactory implements DbFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
