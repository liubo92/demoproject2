package com.lb.demo.thread.proandcus;

/**
 * @author lb
 * @create 2021-03-20
 */
public class ChiHuo extends Thread {

    private Baozi baozi;

    public ChiHuo(String name, Baozi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi) {
                    if (baozi.getFlag() == false) {
                        try {
                            baozi.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("吃货正在吃包子" + baozi.getXian() + baozi.getPi());
                    baozi.setFlag(false);
                    baozi.notify();


            }
        }



    }
}
