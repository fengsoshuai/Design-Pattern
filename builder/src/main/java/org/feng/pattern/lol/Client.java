package org.feng.pattern.lol;

import org.feng.pattern.lol.impl.TankRoleBuilder;

/**
 * LOL游戏建造者测试
 *
 * @author Feng
 * @date 2020/4/29 13:40
 */
public class Client {
    public static void main(String[] args) {
        AbstractRoleBuilder roleBuilder = new TankRoleBuilder();
        Director director = new Director(roleBuilder);
        Role role = director.construct();
        System.out.println(role);
    }
}
