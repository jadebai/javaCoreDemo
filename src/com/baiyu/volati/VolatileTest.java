package com.baiyu.volati;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author baiyu
 * @description: VolatileTest
 * @date: 2018/7/18
 */
public class VolatileTest {

    private static volatile int num;

    private static CountDownLatch countDownLatch = new CountDownLatch(50);

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10,10,200, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(40));
        for (int i = 0; i < 50; i++) {
            final int j = i ;
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    countDownLatch.countDown();
                    numAdd(j);
                }
            });
        }
        try {
            countDownLatch.await();
        }catch (Exception e){

        }
        System.out.println(num);
    }

    private static void numAdd(int i){
        num = i;
    }


}
