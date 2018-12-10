package com.ao.gemini.practice.pattern.structuralPattern.observer;

import java.util.Observable;

/**
 * @author luao
 * @date 2018-11-19 10:53
 */
public class IBroadCast extends Observable implements BroadCast{


    @Override
    public void broadcast() {
        System.out.println("start broadcast ...");
        this.setChanged();
        this.notifyObservers("我的广播：开始广播。。。");
    }


}
