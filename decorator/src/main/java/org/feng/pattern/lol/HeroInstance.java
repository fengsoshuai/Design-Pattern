package org.feng.pattern.lol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 英雄实体，简单列举几个属性，并提供get/set方法
 *
 * @author Feng
 * @date 2020/5/14 13:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroInstance implements Hero {
    /**名字*/
    private String name;
    /**攻击力*/
    private Integer attackPower;
    /**血量*/
    private Integer hp;
    /**移速*/
    private Integer movingSpeed;

    @Override
    public void run() {
        System.out.println(name + " 正在移动！");
    }

    @Override
    public void attack() {
        System.out.println(name + "正在攻击！");
    }
}
