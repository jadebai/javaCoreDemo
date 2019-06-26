package com.baiyu.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author baiyu
 * @description: MyInvocationHandler
 * @date: 2019/3/28
 */
public class MyInvocationHandler implements InvocationHandler {

    private ISayHello proxyImpl;

    public MyInvocationHandler(ISayHello proxyImpl) {
        this.proxyImpl = proxyImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("說話之前打印時間" + System.currentTimeMillis());
        Object ob = method.invoke(proxyImpl,args);
        System.out.println("說話之后打印時間" + System.currentTimeMillis());
        return ob;
    }
}
