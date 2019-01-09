package com.baiyu.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @author baiyu
 * @description: AllTask
 * @date: 2019/1/8
 */
public class AllTask extends RecursiveTask<List<Demo>> {
    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected List<Demo> compute() {
//        System.out.println("执行"+ this.getClass().getSimpleName() + "线程名字为:" + Thread.currentThread().getName());
//        DoTask doTask0 = new DoTask(0);
//        DoTask doTask1 = new DoTask(1);
//        doTask0.fork();
//        doTask1.fork();
        List<Demo> demoList = new ArrayList<>();
//        demoList.addAll(doTask0.join());
//        demoList.addAll(doTask1.join());
        return demoList;
    }
}
