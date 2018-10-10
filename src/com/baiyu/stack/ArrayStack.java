package com.baiyu.stack;

/**
 * @author baiyu
 * @description: ArrayStack  数组实现栈
 * @date: 2018/10/10
 */
public class ArrayStack {

    /**
     * 数据
     */
    private String[] str;

    /**
     * 栈大小
     */
    private int size;

    public ArrayStack(String[] str, int size) {
        this.str = str;
        this.size = size;
    }

    public String pop(){
        if (size ==0){
            throw new RuntimeException("stack is empty!");
        }
        String reStr= str[size-1];
        size--;
        return reStr;
    }

    public void push(String str){
        if (size == this.str.length){
            throw new RuntimeException("stack is full");
        }
        this.str[size] = str;
        size++;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(new String[3],0);
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}
