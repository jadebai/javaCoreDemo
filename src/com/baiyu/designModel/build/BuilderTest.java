package com.baiyu.designModel.build;

/**
 * @author baiyu
 * @description: BuilderTest
 * @date: 2018/8/13
 */
public class BuilderTest {

    public static void main(String[] args) {
        People people = new People.PeopleBuilder().setAge(10).setName("小明").setSex(1).builder();
        System.out.println(people.getName()+people.getAge()+people.getSex());
    }
}
