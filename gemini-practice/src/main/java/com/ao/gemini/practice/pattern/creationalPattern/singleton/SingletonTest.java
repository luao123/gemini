package com.ao.gemini.practice.pattern.creationalPattern.singleton;

/**
 * @author luao
 * @date 2018-11-15 15:57
 */
public class SingletonTest {
    public static void main(String[] args) {
        //不能直接new
        //Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}
