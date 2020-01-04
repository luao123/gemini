package com.gemini.ao.designpatten.singleton.hungry;

public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
