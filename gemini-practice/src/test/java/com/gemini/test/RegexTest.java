package com.gemini.test;

import java.util.regex.Pattern;

/**
 * @author luao
 * @date 2018-11-15 15:45
 */
public class RegexTest {
    //电话或者座机
    public static final String REGEX_MOBILE = "^0\\d{2,3}-\\d{7,8}|(((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8})$";


    public static void main(String[] args) {
        String phone = "18271861787";
        phone = "010-1234567";
        boolean flag = Pattern.matches(REGEX_MOBILE,phone);
        System.out.println(flag);

    }
}
