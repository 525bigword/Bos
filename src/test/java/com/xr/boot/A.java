package com.xr.boot;

import org.junit.Test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class A {
    /**TODO permits 令牌数量*/
    private Semaphore semaphore=new Semaphore(50);
    @Test
    public void a(){
        try {
            semaphore.tryAcquire(5, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
