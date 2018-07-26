package com.baiyu.volati;

import javax.jws.soap.SOAPBinding;
import java.util.concurrent.CountDownLatch;

/**
 * @author baiyu
 * @description: Volatile2Test
 * @date: 2018/7/18
 */
public class Volatile2Test {
    private static boolean flag = false;

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!flag) {
                    System.out.println("有问题");
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(100);
        }catch (Exception e){

        }
        flag = true;
    }
}
