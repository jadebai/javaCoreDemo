package com.baiyu.thread;

/**
 * @author baiyu
 * @description: ThreadLocalTest
 * @date: 2018/7/12
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        final Demo demo = new ThreadLocalTest().new Demo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.setNum(1);
                try {
                    Thread.sleep(100);
                }catch (Exception e){

                }
                demo.getNum("thread1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.setNum(2);
                try {
                    Thread.sleep(100);
                }catch (Exception e){

                }
                demo.getNum("thread2");
            }
        });
        thread1.start();
        thread2.start();
    }

    class Demo{
//        private int num;
        private ThreadLocal<Integer> num = new ThreadLocal<>();
        public void setNum(int num){
//            this.num = num;
            this.num.set(num);
        }

        public void getNum(String name){
//            System.out.println(name+":num=="+num);
            System.out.println(name+":num=="+num.get());
        }
    }
}
