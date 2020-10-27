package com.dqx.test.哲学家就餐;

import com.dqx.test.n2.util.Sleeper;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

//lock锁解决哲学家就餐问题
@Slf4j(topic = "c.Philosopher")
public class Philosopher extends Thread{
    Chopstick left;
    Chopstick right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            //　尝试获得左手筷子
            if(left.tryLock()) {
                try {
                    // 尝试获得右手筷子
                    if(right.tryLock()) {
                        try {
                            eat();
                        } finally {
                            right.unlock();
                        }
                    }
                } finally {
                    left.unlock(); // 释放自己手里的筷子
                }
            }
        }
    }

    Random random = new Random();
    private void eat() {
        log.debug("eating...");
        Sleeper.sleep(0.5);
    }
}
