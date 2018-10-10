package com.baiyu.designModel.build;

/**
 * @author baiyu
 * @description: People
 * @date: 2018/8/13
 */
public class People {

    private String name;
    private int age;
    private int sex;

    private People(PeopleBuilder peopleBuilder){
        this.name = peopleBuilder.name;
        this.age = peopleBuilder.age;
        this.sex = peopleBuilder.sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public static class PeopleBuilder{
        private String name;
        private int age;
        private int sex;

        public PeopleBuilder setName(String name){
            this.name = name;
            return this;
        }

        public PeopleBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public PeopleBuilder setSex(int sex){
            this.sex = sex;
            return this;
        }

        public People builder(){
            return new People(this);
        }
    }
}
