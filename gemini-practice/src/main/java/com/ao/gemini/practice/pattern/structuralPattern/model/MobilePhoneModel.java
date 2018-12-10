package com.ao.gemini.practice.pattern.structuralPattern.model;

/**
 * 模板模式
 * 以手机模型为例
 *
 * @author luao
 * @date 2018-11-15 15:21
 */
public abstract class MobilePhoneModel {

    private boolean hasNFC = true;

    /**
     * 开机
     */
    protected abstract void powerOn();

    /**
     * 关机
     */
    protected abstract void powerOf();

    /**
     * 音乐
     */
    protected abstract void music();

    /**
     * 视频
     */
    protected abstract void video();

    /**
     * nfc功能
     */
    protected abstract void NFC();

    /**
     * 打电话
     */
    protected abstract void call();

    /**
     * 手机功能测试
     */
    final void play(){
        powerOn();
        music();
        call();
        video();
        if (hasNFC){
            NFC();
        }
        powerOf();
    }

    public boolean isHasNFC() {
        return hasNFC;
    }

    public void setHasNFC(boolean hasNFC) {
        this.hasNFC = hasNFC;
    }
}
