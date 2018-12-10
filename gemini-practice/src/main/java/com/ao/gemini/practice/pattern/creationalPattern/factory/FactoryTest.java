package com.ao.gemini.practice.pattern.creationalPattern.factory;


public class FactoryTest {
    public static void main(String[] args) {
        AbstractFoodFactory foodFactory = new FoodFactory();
//        FoodFactory foodFactory = new FoodFactory();
        AbstractFoodFactory foodFactory2 = new FoodFactory2();
        Food potato = foodFactory.createFood(Potato.class);
        potato.eat();
        Food Banane = foodFactory.createFood(Banane.class);
        Banane.eat();
//        foodFactory2.createFood2();


    }
}
