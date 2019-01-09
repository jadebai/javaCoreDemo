package com.baiyu.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @author baiyu
 * @description: DoTask
 * @date: 2019/1/8
 */
public class DoTask extends RecursiveTask<List<Demo>> {

    private int[] typeList;

    public DoTask(int[] typeList) {
        this.typeList = typeList;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected List<Demo> compute(){
        System.out.println("执行"+ this.getClass().getSimpleName() + "线程名字为:" + Thread.currentThread().getName());
        List<Demo> demoList = new ArrayList<>();
        if (typeList.length==1){
            demoList.add(new Demo(typeList[0],"haha"));
            demoList.add(new Demo(typeList[0],"heihei"));
            demoList.add(new Demo(typeList[0],"hehe"));
            return demoList;
        }else{
            List<DoTask> doTaskList = new ArrayList<>();
            for (int type : typeList){
                DoTask doTask = new DoTask(new int[]{type});
                doTaskList.add(doTask);
                doTask.fork();
            }
//            invokeAll(doTaskList);
            for (DoTask doTask : doTaskList){
                demoList.addAll(doTask.join());
            }
            return demoList;
        }
    }
}
