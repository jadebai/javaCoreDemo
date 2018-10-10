package com.baiyu.stack;

import java.nio.channels.Pipe;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author baiyu
 * @description: QueueStack
 * @date: 2018/10/10
 */
public class QueueStack {

    private LinkedList<String> queue;

    private int size;

    public QueueStack(LinkedList<String> queue, int size) {
        this.queue = queue;
        this.size = size;
    }

    public String pop() {
        if (size == 0) {
            throw new RuntimeException("stack is empty");
        }
        size--;
        return queue.pollLast();
    }

    public void push(String object) {
        queue.add(object);
        size++;
    }

    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack(new LinkedList<String>(), 0);
        queueStack.push("1");
        queueStack.push("2");
        queueStack.push("3");
        System.out.println(queueStack.pop());
        System.out.println(queueStack.pop());
        System.out.println(queueStack.pop());
        System.out.println(queueStack.pop());
        System.out.println(queueStack.pop());

    }
}
