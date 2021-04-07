package com.lb.demo.thread.testvolatile;

/**
 * @author lb
 * @create 2021-03-21
 */
public class MyVolatile implements Runnable{
    private volatile boolean flag = false;


    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;
        System.out.println("flag===="+flag);

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
