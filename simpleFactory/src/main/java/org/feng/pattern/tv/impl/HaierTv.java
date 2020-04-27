package org.feng.pattern.tv.impl;

import org.feng.pattern.tv.Tv;

/**
 * 海尔电视机
 */
public class HaierTv implements Tv {
    @Override
    public void play() {
        System.out.println("海尔电视机正在播放！");
    }
}
