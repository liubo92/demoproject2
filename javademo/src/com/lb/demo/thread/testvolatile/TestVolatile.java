package com.lb.demo.thread.testvolatile;

/**
 *
 * volatile 保证数据的可见性
 *
 * 不能保证互斥性
 * 不能保证原子性
 *
 *
 *
 * @author lb
 * @create 2021-03-21
 */
public class TestVolatile {
    public static void main(String[] args) {
        MyVolatile myVolatile = new MyVolatile();
        Thread thread = new Thread(myVolatile);
        thread.start();
        while (true){
            //synchronized (myVolatile){
                if(myVolatile.isFlag()){
                    System.out.println("===============================");
                    break;
                }
            //}

        }

    }
}
