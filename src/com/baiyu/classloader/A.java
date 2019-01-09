package com.baiyu.classloader;

/**
 * @author baiyu
 * @description: A
 * @date: 2019/1/4
 */
public class A {

    static class Father{
        public static String ff = "6";
        static {
            System.out.println(5);
        }
        {
            System.out.println(6);
        }
    }

    static class Son extends Father{
        static {
            System.out.println(3);
        }
        {
            System.out.println(4);
        }
    }

    static {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }

    public static void main(String[] args) {
        String m = Son.ff;
    }
}
