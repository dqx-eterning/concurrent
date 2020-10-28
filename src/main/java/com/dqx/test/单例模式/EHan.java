package com.dqx.test.单例模式;

public class EHan {
    private static EHan instance;
    private EHan(){}
    public static EHan getInstance(){
        instance = new EHan();
        return instance;
    }
}
