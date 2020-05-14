package org.feng.pattern.lol;

/**
 * LOL英雄装饰测试
 *
 * @author Feng
 * @date 2020/5/14 14:01
 */
public class Client {
    public static void main(String[] args) {
        Hero hero = new HeroInstance("盖伦", 93, 800, 324);
        AbstractHeroDecorator heroDecorator = new AttackHeroDecorator(hero);
        heroDecorator.attack();
    }
}
