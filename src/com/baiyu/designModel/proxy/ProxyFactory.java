package com.baiyu.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author baiyu
 * @description: ProxyFactory
 * @date: 2019/3/28
 */
public class ProxyFactory {

    public static <T> T getProxy(Class<T> tClass,InvocationHandler invocationHandler){
        return (T)Proxy.newProxyInstance(tClass.getClassLoader(),new Class[]{tClass},invocationHandler);
    }

}
