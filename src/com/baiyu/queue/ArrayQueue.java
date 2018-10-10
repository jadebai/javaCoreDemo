package com.baiyu.queue;

import com.sun.media.sound.AiffFileReader;

/**
 * @author baiyu
 * @description: ArrayQueue
 * @date: 2018/10/10
 */
public class ArrayQueue {

    private int[] arr;

    private int size;

    private int arrLength;

    public ArrayQueue(int[] arr) {
        this.arr = arr;
        this.size = 0;
        this.arrLength = 0;
    }

    public int poll(){
        if (size == 0){
            throw new RuntimeException("queue is empty");
        }
        int reInt = arr[arrLength - size];
        size--;
        return reInt;
    }


    public void add(int a){
        if (size == arr.length){
            throw new RuntimeException("queue is full");
        }
        arr[size] = a;
        arrLength ++;
        size ++;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(new int[3]);
        arrayQueue.add(1);
        arrayQueue.add(2);
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
    }
}
