package com.lb.demo.thread;

import netscape.security.Target;

/**
 * 集成thread
 *
 * @author lb
 * @create 2021-03-20
 */
public class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("MY thread......");
    }
}
