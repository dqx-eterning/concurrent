package com.dqx.test.单例模式;


//静态内部类
public class SingLeton {
    private static class SingLetonHolder{
        private  static final SingLeton instance = new SingLeton();
    }
    private SingLeton(){

    }
    public static final SingLeton getInstance(){
        return SingLetonHolder.instance;
    }
}
