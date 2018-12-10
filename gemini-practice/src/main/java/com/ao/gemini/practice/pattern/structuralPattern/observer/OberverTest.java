package com.ao.gemini.practice.pattern.structuralPattern.observer;

/**
 * @author luao
 * @date 2018-11-19 17:21
 */
public class OberverTest {
    public static void main(String[] args) {
        IBroadCast iBroadCast = new IBroadCast();
        IRadio iRadio = new IRadio();
        iBroadCast.addObserver(iRadio);
        iBroadCast.broadcast();
    }
}
