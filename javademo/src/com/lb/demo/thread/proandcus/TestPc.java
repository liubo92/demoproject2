package com.lb.demo.thread.proandcus;

/**
 * @author lb
 * @create 2021-03-20
 */
public class TestPc {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();

        ChiHuo chiHuo = new ChiHuo("吃货", baozi);
        Baozipu baozipu = new Baozipu("包子铺", baozi);
        baozipu.start();
        chiHuo.start();
    }
}
