package com.dqx.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

//自定义线程运行顺序，park，unpark实现
@Slf4j(topic = "c.Test26")
public class Test26 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            LockSupport.park();
            log.debug("1");
        }, "t1");
        t1.start();

        new Thread(() -> {
            log.debug("2");
            LockSupport.unpark(t1);
        },"t2").start();
    }
}
