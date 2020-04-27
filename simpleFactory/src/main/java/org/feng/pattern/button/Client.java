package org.feng.pattern.button;

/**
 * 客户端：测试按钮工厂是否正常运行。
 * @author Feng
 */
public class Client {
    public static void main(String[] args) {
        AbstractButton button = ButtonFactory.getButton("round");
        button.say();

        button = ButtonFactory.getButton("diamond");
        button.say();

        button = ButtonFactory.getButton("rectangle");
        button.say();
    }
}
