package com.baiyu.thread;

import java.util.concurrent.*;

/**
 * @author baiyu
 * @description: ThreadPoolTest
 * @date: 2018/7/18
 */
public class ThreadPoolTest {

    static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws InterruptedException {
//        System.out.println((-1<<29) | 0);
//        ScheduledExecutorService executorService =
//                new ScheduledThreadPoolExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1111111111"+ Thread.currentThread().getName());
            }
        });

        Thread.sleep(10000L);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("222222"+ Thread.currentThread().getName());
            }
        });

    }
}
