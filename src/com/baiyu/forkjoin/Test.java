package com.baiyu.forkjoin;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * @author baiyu
 * @description: Test
 * @date: 2019/1/8
 */
public class Test {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        DoTask task = new DoTask(new int[]{1,2,3,4,5});
        List<Demo> list = pool.invoke(task);
//        Future<List<Demo>> result = pool.submit(task);
//        List<Demo> list = null;
//        try {
//            list = result.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        for (Demo demo : list){
            System.out.println(demo.getName()+demo.getAge());
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
