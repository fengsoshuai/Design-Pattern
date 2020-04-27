package org.feng.pattern.tv.impl;

import org.feng.pattern.tv.Tv;

/**
 * 默认电视机
 * @author Feng
 */
public class DefaultTv implements Tv {
    @Override
    public void play() {
        System.out.println("默认的电视机正在播放！");
    }
}
