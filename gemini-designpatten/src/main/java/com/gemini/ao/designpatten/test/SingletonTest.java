package com.gemini.ao.designpatten.test;

import com.gemini.ao.designpatten.singleton.hungry.HungrySingleton;
import com.gemini.ao.designpatten.singleton.lazy.LazyOne;
import com.gemini.ao.designpatten.singleton.lazy.LazyThree;
import com.gemini.ao.designpatten.singleton.lazy.LazyTwo;

import java.util.concurrent.CountDownLatch;

public class SingletonTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 10000;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                try {
                    Object obj = LazyThree.getInstance();                    System.out.println(System.currentTimeMillis() + ":" + obj);
                } catch (Exception e) {
                    System.out.println("Error!");
                }
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
            System.out.println("耗时:" + (System.currentTimeMillis() - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
