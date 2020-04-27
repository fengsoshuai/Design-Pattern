package org.feng.pattern.button.factory;

import org.feng.pattern.button.AbstractButton;
import org.feng.pattern.button.AbstractButtonFactory;
import org.feng.pattern.button.entity.RoundButton;

/**
 * 具体的圆形按钮工厂
 * @see AbstractButtonFactory
 */
public class RoundButtonFactory extends AbstractButtonFactory {
    @Override
    public AbstractButton getButton() {
        return new RoundButton();
    }
}
