package org.feng.pattern.lol;

/**
 * LOL中的英雄接口，只要是英雄就应该实现这个接口。
 *
 * @author Feng
 * @date 2020/5/14 13:32
 */
public interface Hero {
    /**移动*/
    void run();
    /**攻击*/
    void attack();
}
