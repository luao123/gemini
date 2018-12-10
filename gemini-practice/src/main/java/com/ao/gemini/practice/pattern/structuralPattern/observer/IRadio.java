package com.ao.gemini.practice.pattern.structuralPattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author luao
 * @date 2018-11-19 16:28
 */
public class IRadio implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收音机：接收到到广播信号，开始进行一些列操作。。。");
        this.doSomeThing(arg.toString());
        System.out.println("收音机：操作完毕");
    }

    public void doSomeThing(String context){
        System.out.println("doSomeThing...");
    }
}
