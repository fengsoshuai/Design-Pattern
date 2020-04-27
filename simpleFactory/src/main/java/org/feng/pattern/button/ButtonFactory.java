package org.feng.pattern.button;

import org.feng.pattern.button.impl.DiamondButtonImpl;
import org.feng.pattern.button.impl.RectangleButtonImpl;
import org.feng.pattern.button.impl.RoundButtonImpl;

/**
 * 按钮工厂：生产按钮实例
 *
 * 类的内部定义一个按钮类型的枚举类：
 * 这一点，在实际开发中通常会使用外部配置文件的方式进行配置。可以是XML、Properties文件等。
 * @author Feng
 */
public class ButtonFactory {
    /**
     * 静态工厂方法
     *
     * 扩展：有兴趣的朋友，可以在外部定义一个Map，key为String类型，value为对应的实例。
     * 在取对象时，可以直接从Map中进行get（这一点，Spring 框架中就是这麽用的啦）
     * @param buttonType 按钮的类型；根据参数获得不同的按钮实例
     * @return AbstractButton 的实现类
     */
    public static AbstractButton getButton(String buttonType){

        if(ButtonType.DIAMOND.type.equalsIgnoreCase(buttonType)){
            return new DiamondButtonImpl();
        }

        if(ButtonType.RECTANGLE.type.equalsIgnoreCase(buttonType)){
            return new RectangleButtonImpl();
        }

        if(ButtonType.ROUND.type.equalsIgnoreCase(buttonType)){
            return new RoundButtonImpl();
        }

        throw new IllegalArgumentException("没有这个类型的按钮！");
    }

    /**
     * 按钮类型
     */
    private enum ButtonType {
        /**菱形*/
        DIAMOND("diamond"),
        /**方形*/
        RECTANGLE("rectangle"),
        /**圆形*/
        ROUND("round");

        private String type;
        ButtonType(String type){
            this.type = type;
        }
    }
}
