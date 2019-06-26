package com.baiyu.designModel.proxy;

import java.lang.reflect.Proxy;

/**
 * @author baiyu
 * @description: PoxyTest
 * @date: 2019/3/28
 */
public class PoxyTest {

    public static void main(String[] args) {
        ISayHello sayHello = new SayHello();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(sayHello);
        ISayHello proxy = (ISayHello)ProxyFactory.getProxy(ISayHello.class,myInvocationHandler);
        proxy.sayHello("xiaoming");
    }
}
