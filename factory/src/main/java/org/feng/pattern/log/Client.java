package org.feng.pattern.log;

import org.feng.pattern.log.factory.DatabaseLogFactory;
import org.feng.pattern.log.factory.FileLogFactory;

/**
 * 日志工厂的测试类：
 * 优化方案，使用xml文件动态获取具体工厂的类名，通过反射获取（未实现，有兴趣的朋友可以自己去实现）
 * 若使用了反射，就可以真正意义上达到开闭原则了。
 * @author Feng
 */
public class Client {
    public static void main(String[] args) {
        LogFactory factory;
        factory = new DatabaseLogFactory();
        factory.createLog().writeLog();

        factory = new FileLogFactory();
        factory.createLog().writeLog();
    }
}
