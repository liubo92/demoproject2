package com.lb.demo.thread;

/**
 * @author lb
 * @create 2021-03-20
 */
public class TestWait {

    public  static  Object obj = new Object();

    public static void main(String[] args) {
        new Thread(

                ()->{

                   synchronized (obj){
                       System.out.println(Thread.currentThread().getName()+"====获取到对象锁,调用wait,进去无线等待状态，释放了线程锁");
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                    System.out.println(Thread.currentThread().getName()+"====被唤醒继续执行========");
                }

       ,"等待线程" ).start();

        new Thread(

                ()->{
                    try {
                        System.out.println(Thread.currentThread().getName()+"====线程睡眠3秒");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName()+"调用notifyall,释放锁对象");
                        obj.notify();
                    }


                }

                ,"唤醒线程" ).start();
    }
}
