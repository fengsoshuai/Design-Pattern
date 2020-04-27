package org.feng.pattern.button.factory;

import org.feng.pattern.button.AbstractButton;
import org.feng.pattern.button.AbstractButtonFactory;
import org.feng.pattern.button.entity.RectangleButton;

/**
 * 矩形按钮工厂类
 * @author Feng
 */
public class RectangleButtonFactory extends AbstractButtonFactory {
    @Override
    public AbstractButton getButton() {
        return new RectangleButton();
    }
}
