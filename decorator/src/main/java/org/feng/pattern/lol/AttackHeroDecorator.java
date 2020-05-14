package org.feng.pattern.lol;

/**
 * 攻击装饰器
 *
 * @author Feng
 * @date 2020/5/14 13:57
 */
public class AttackHeroDecorator extends AbstractHeroDecorator {
    public AttackHeroDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void attack() {
        HeroInstance heroInstance = (HeroInstance)hero;
        System.out.println(((HeroInstance) hero).getName() + "出了个攻击装！");
        heroInstance.setAttackPower(heroInstance.getAttackPower() + 80);
        super.attack();
    }
}
