package com.lb.demo.thread.proandcus;

/**
 * @author lb
 * @create 2021-03-20
 */
public class Baozipu extends Thread {
    private Baozi baozi;

    public Baozipu(String name, Baozi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baozi) {
                if (baozi.getFlag() == true) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺开始做包子");
                if (count % 2 == 0) {
                    baozi.setPi("厚皮");
                    baozi.setXian("牛肉");

                } else {
                    baozi.setPi("原皮");
                    baozi.setXian("菜包");
                }
                count++;
                baozi.setFlag(true);
                System.out.println("包子好了，吃货起来吃吧" + baozi.getPi() + baozi.getXian());
                baozi.notify();
            }

        }


    }
}
