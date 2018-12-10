package com.ao.gemini.practice.pattern.structuralPattern.model;

/**
 * @author luao
 * @date 2018-11-15 17:22
 */
public class ModelTest {

    public static void main(String[] args) {
        //三星
        SamsungMobilePhone samsungMobilePhone = new SamsungMobilePhone();
        //联想
        LenovoMobilePhone lenovoMobilePhone = new LenovoMobilePhone();
        lenovoMobilePhone.setHasNFC(false);
        samsungMobilePhone.play();
        lenovoMobilePhone.play();
    }
}
