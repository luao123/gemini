package com.gemini.ao.designpatten.singleton.lazy;

import com.gemini.ao.designpatten.singleton.hungry.HungrySingleton;

import java.util.concurrent.CountDownLatch;

public class LazyOne {

    private static LazyOne lazyOne = null;

    private LazyOne(){};

    public static LazyOne getInstance() {
        if (lazyOne == null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
