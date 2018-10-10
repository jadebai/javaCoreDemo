package com.baiyu.enums;

/**
 * @author baiyu
 * @description: People
 * @date: 2018/8/13
 */
public enum People {

    MAN("MAN",18),
    CHILD("CHILD",1),
    OLD("OLD",70),
    ;
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
