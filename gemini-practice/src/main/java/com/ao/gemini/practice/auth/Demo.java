package com.ao.gemini.practice.auth;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author luao
 * @description TODO
 * @date 2018-11-22 15:11
 */
public class Demo {

    public static void main(String[] args) {
        List<String> dataList = Lists.newArrayList("d门店|b门店|c门店","a门店|d门店|e门店","c门店|a门店|d门店","e门店","d门店","c门店");

        System.out.println(getFirst(dataList.get(1)));


    }
    public void getFinalData(){
//        String str = "aabbbcd";
//        List<String> dataList = Lists.newArrayList("a门店|b门店|c门店","a门店|d门店|e门店","c门店|a门店|d门店","e门店","d门店","c门店");
//        for (int i = 0; i < dataList.size(); i++) {
//            String first = getFirst(dataList.get(i));
//            if (first.equals())
//        }

    }

    void isFirst(){

    }

    void isTopThree(String str){

    }

    static String getFirst(String str){
        return str.substring(0,str.indexOf("|"));
    }



}
