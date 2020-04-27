package org.feng.pattern.tv.impl;

import org.feng.pattern.tv.Tv;

/**
 * 海信电视机
 * @author Feng
 */
public class HisenseTv implements Tv {
    @Override
    public void play() {
        System.out.println("海信电视机正在播放！");
    }
}
