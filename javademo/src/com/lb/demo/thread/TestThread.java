package com.lb.demo.thread;

/**
 * @author lb
 * @create 2021-03-20
 */
public class TestThread {
    public static void main(String[] args) {
        //集成实现线程
//        Mythread mythread = new Mythread();
//        mythread.start();

        //runable 实现线程
        Thread thread = new Thread(new MythreadRunable());
        thread.start();

    }
}
