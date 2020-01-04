package com.gemini.ao.designpatten.singleton.lazy;

public class LazyThree {

    private static boolean flag = false;

    static class LazyThreeHolder {
        private static final LazyThree lazy = new LazyThree();
    }

    private LazyThree(){
        if (!flag) {
            flag = !flag;
        }else {
            throw new RuntimeException("单例被破坏！");
        }

    }

    public static LazyThree getInstance(){
        return LazyThreeHolder.lazy;
    }

    private Object readResolve(){
        return  LazyThreeHolder.lazy;
    }

}
