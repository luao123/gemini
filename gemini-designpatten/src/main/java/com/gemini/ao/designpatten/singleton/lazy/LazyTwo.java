package com.gemini.ao.designpatten.singleton.lazy;

public class LazyTwo {
    private static LazyTwo lazy = null;

    private LazyTwo(){};

    public synchronized static LazyTwo getInstance() {
        if (lazy == null){
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
