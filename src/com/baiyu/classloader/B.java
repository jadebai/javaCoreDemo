package com.baiyu.classloader;

import java.nio.channels.Pipe;

/**
 * @author baiyu
 * @description: B
 * @date: 2019/1/7
 */
public class B {
   static class F{
       static final String f = "f";
       static {
           System.out.println("1");
       }
       {
           System.out.println("2");
       }
       static int m(){
           System.out.println(7);
           return 8;
       }
   }

    static class S1 extends F{
        static String f2 = "s1";
        static {
            System.out.println("3");
        }
        {
            System.out.println("4");
        }
    }

    static class S2 extends F{
        static {
            System.out.println("5");
        }
        {
            System.out.println("6");
        }
    }

    public static void main(String[] args) {
        System.out.println(S2.f);
        System.out.println(S1.f2);
        System.out.println(S2.m());

    }
}
