package com.lb.demo.thread.proandcus;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程安全
 *
 * @author lb
 * @create 2021-03-20
 */
public class Ticket implements Runnable{

    private    int count= 100;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
//            synchronized (lock){
                if(count>0){
                    count--;
                   String name =  Thread.currentThread().getName();
                    System.out.println(name+"正在卖票"+count);
                }
//            }
            lock.unlock();
        }

    }
}
