package com.ao.gemini.practice.pattern.creationalPattern.singleton;

/**
 * 单例模式饿汉式
 */
public class Singleton {
    //类成员（只有一份，天然线程安全）
    private static final Singleton singleton = new Singleton();

    //
    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}
