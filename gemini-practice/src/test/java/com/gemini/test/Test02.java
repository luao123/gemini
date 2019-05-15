package com.gemini.test;

/**
 * @author luao
 * @description 对于 Integer var = ?
 * 在-128 至 127 范围内的赋值，Integer 对象是在 IntegerCache.cache 产生，会复用已有对象，
 * 这个区间内的 Integer 值可以直接使用==进行 判断，但是这个区间之外的所有数据，都会在堆上产生，
 * 并不会复用已有对象，这是一个大坑， 推荐使用 equals 方法进行判断。
 * @date 2018-12-12 15:38
 */
public class Test02 {
    public static void main(String[] args) {
        Integer i = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i == i2);
        System.out.println(i+1 == i3);
        System.out.println(i3 == i4);

    }



    private void fun1(){
        Integer i = -127;
        Integer i2 = -127;
        Integer i3 = -129;
        Integer i4 = -129;

        System.out.println(i == i2);
        System.out.println(i-1 == i3);
        System.out.println(i3 == i4);
    }

}
