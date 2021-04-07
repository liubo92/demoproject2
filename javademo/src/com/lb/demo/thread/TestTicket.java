package com.lb.demo.thread;

import com.lb.demo.thread.proandcus.Ticket;

/**
 * @author lb
 * @create 2021-03-20
 */
public class TestTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        thread1.start();
        thread2.start();
    }
}
