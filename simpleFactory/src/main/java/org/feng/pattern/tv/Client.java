package org.feng.pattern.tv;

import org.feng.pattern.tv.util.XmlUtil;

/**
 * 电视工厂的测试类
 * @author Feng
 */
public class Client {
    public static void main(String[] args) {
        String beanName = XmlUtil.getBeanName();
        Tv bean = TvFactory.getBean(beanName);
        bean.play();
    }
}
