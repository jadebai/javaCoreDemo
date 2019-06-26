package com.baiyu.designModel.proxy;

/**
 * @author baiyu
 * @description: SayHello
 * @date: 2019/3/28
 */
public class SayHello implements ISayHello {

    @Override
    public void sayHello(String people) {
        System.out.println(people + " sayHello to you");
    }
}
