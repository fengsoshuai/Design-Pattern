package org.feng.pattern.db;

import org.feng.pattern.db.util.XmlUtil;

import java.util.Optional;

/**
 * 数据库抽象工厂的测试类
 * @author Feng
 */
public class Client {
    public static void main(String[] args) {
        Optional<DbFactory> factory = XmlUtil.getFactory();
        // 打印获得的对象的名字
        if(factory.isPresent()){
            DbFactory dbFactory = factory.get();
            // 工厂的名字
            System.out.println(dbFactory.getClass().getSimpleName());
            // 连接对象的名字
            System.out.println(dbFactory.createConnection().getClass().getSimpleName());
            // 语句对象的名字
            System.out.println(dbFactory.createStatement().getClass().getSimpleName());
        }
    }
}
