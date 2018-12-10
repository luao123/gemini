package com.ao.gemini.practice.pattern.structuralPattern.model;

/**
 * @author luao
 * @date 2018-11-15 16:34
 */
public class SamsungMobilePhone extends MobilePhoneModel {
    @Override
    protected void powerOn() {
        System.out.println("Samsung start...");
    }

    @Override
    protected void powerOf() {
        System.out.println("Samsung over...");
    }

    @Override
    protected void music() {
        System.out.println("Samsung music...");
    }

    @Override
    protected void video() {
        System.out.println("Samsung video...");
    }

    @Override
    protected void NFC() {
        System.out.println("Samsung nfc...");
    }

    @Override
    protected void call() {
        System.out.println("Samsung call...");
    }


}
