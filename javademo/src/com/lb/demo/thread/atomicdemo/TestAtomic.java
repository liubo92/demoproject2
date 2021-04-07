package com.lb.demo.thread.atomicdemo;

import javax.sound.midi.Soundbank;

/**
 * @author lb
 * @create 2021-03-21
 */
public class TestAtomic {
    public static void main(String[] args) {

        AtomicDemo atomicDemo = new AtomicDemo();
        for (int i = 0; i <10 ; i++) {

            new Thread(atomicDemo).start();
        }
    }
}
