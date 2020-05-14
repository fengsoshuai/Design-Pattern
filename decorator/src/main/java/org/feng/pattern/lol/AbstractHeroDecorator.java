package org.feng.pattern.lol;

/**
 * 英雄装饰器
 *
 * @author Feng
 * @date 2020/5/14 13:54
 */
public abstract class AbstractHeroDecorator implements Hero {
    protected Hero hero;

    public AbstractHeroDecorator(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void run() {
        hero.run();
    }

    @Override
    public void attack() {
        hero.attack();
    }
}
