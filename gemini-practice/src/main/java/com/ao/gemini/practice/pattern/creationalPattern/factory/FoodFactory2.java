package com.ao.gemini.practice.pattern.creationalPattern.factory;

public class FoodFactory2 extends AbstractFoodFactory {
    @Override
    public <T extends Food> T createFood(Class<T> c) {
        Food food = null;
        try {
            food = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)food;
    }

    @Override
    public <T extends Food> T createFood2(Class<T> t) {
        return null;
    }
}
