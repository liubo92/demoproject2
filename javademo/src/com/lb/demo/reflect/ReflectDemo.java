package com.lb.demo.reflect;

import java.net.SocketTimeoutException;

/**
 * @author lb
 * @create 2021-03-10
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class cls1 = Class.forName("com.lb.demo.reflect.Person");

        Class cls2 = person.getClass();

        Class cls3 = Person.class;

        System.out.println(cls1==cls2);
        System.out.println(cls3==cls2);
        System.out.println(cls3);

    }
}
