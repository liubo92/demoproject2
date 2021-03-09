package com.lb.demo.interfacef.impl;

import java.util.function.Consumer;

/**
 * @author lb
 * @create 2021-03-09
 */
public class DemoConsumer {
    public static  void method(String name1, Consumer<String> con){
        con.accept(name1);
    }

    public static void main(String[] args) {
        method("刘波",(name)-> System.out.println(name));

        method("刘波测试",(name)->{
            String nameBuiler = new StringBuffer(name).reverse().toString();
            System.out.println(nameBuiler);


        });
    }
}
