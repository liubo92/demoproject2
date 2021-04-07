package com.lb.demo.thread.atomicdemo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lb
 * @create 2021-03-21
 */
public class AtomicDemo implements Runnable{

//    private  int num=0;
//    @Override
//    public void run() {
//        synchronized (AtomicDemo.class){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            num++;
//            System.out.println("num=============="+num);
//        }
//    }
    private AtomicInteger num= new AtomicInteger();
    @Override
    public void run() {
        synchronized (AtomicDemo.class){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("num=============="+getNum());
        }
    }

    public int getNum() {
        return num.getAndIncrement();
    }

}
