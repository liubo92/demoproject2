package com.lb.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lb
 * @create 2021-03-10
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //获取成员变量
        Class cls = Person.class;
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);

        }

        //获取所有成员变量
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);
        Person p = new Person();
        field.set(p, "刘波");
        System.out.println(p.getName());

        //获取构造器
        Constructor constructor = cls.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);
        Person p2 = (Person) constructor.newInstance("zaaa", "cccc");

        System.out.println(p2.getName());


        //获取方法
        Method sayHello = cls.getMethod("sayHello");
        Method sayHello2 = cls.getDeclaredMethod("say");

        sayHello.invoke(p);
        sayHello2.setAccessible(true);
        sayHello2.invoke(p);


        //获取所有方法

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.toString());

        }



    }
}
