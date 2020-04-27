package org.feng.pattern.button;

import org.feng.pattern.button.util.XmlUtil;

import java.util.Optional;

/**
 * 按钮工厂方法的测试
 * @author Feng
 */
public class Client {
    public static void main(String[] args) {
        // 解析xml文件，反射回去工厂对象
        Optional<AbstractButtonFactory> buttonFactory = XmlUtil.getBean();
        // 若获取到了
        if(buttonFactory.isPresent()){
            // 使用工厂，并创建Button，调用Button的方法
            AbstractButtonFactory factory = buttonFactory.get();
            factory.getButton().say();
        }
    }
}
