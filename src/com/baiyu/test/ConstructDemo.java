package com.baiyu.test;

/**
 * @author baiyu
 * @description: ConstructDemo
 * @date: 2018/8/10
 */
public class ConstructDemo {

    private int age;
    private int sex;
    private String name;

    ConstructDemo(int age,int sex,String name){
        this(age,sex);
        this.name = name;
    }

    ConstructDemo(int age,int sex){

    }
}
