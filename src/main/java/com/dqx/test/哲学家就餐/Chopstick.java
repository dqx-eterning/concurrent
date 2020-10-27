package com.dqx.test.哲学家就餐;

import java.util.concurrent.locks.ReentrantLock;

public class Chopstick extends ReentrantLock {
    String name;
    public Chopstick(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "筷子{" + name + '}';
    }

}
