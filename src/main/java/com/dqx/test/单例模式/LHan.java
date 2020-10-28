package com.dqx.test.单例模式;

//单例懒汉
public class LHan {
    private static LHan instance; //懒汉式
    private LHan(){

    }//私有构造
    public static LHan getInstance(){
        if (instance == null){
            instance = new LHan();
        }
        return instance;
    }
}
