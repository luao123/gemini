package com.ao.gemini.practice.pattern.structuralPattern.model;


/**
 * @author luao
 * @date 2018-11-15 16:29
 */
public class LenovoMobilePhone extends MobilePhoneModel {

    @Override
    protected void powerOn() {
        System.out.println("Lenovo start...");
    }

    @Override
    protected void powerOf() {
        System.out.println("Lenovo over...");
    }

    @Override
    protected void music() {
        System.out.println("Lenovo listen music...");
    }

    @Override
    protected void video() {
        System.out.println("Lenovo watch video...");
    }

    @Override
    protected void NFC() {
        System.out.println("Lenovo use nfc...");
    }

    @Override
    protected void call() {
        System.out.println("Lenovo call...");
    }
}
