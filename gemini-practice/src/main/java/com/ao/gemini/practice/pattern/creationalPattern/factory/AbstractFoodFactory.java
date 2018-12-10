package com.ao.gemini.practice.pattern.creationalPattern.factory;


/**
 * 抽象工厂模式
 */
public abstract class AbstractFoodFactory {
    public abstract <T extends Food>T createFood(Class<T> c);

    public abstract <T extends Food>T createFood2(Class<T> t);
}
