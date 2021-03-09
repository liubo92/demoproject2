package com.lb.demo.interfacef.impl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * 生产形函数式接口
 * @author lb
 * @create 2021-03-08
 */
public class DemoSupplier {
    public static  int getMax(Supplier<Integer>  sup){
        return sup.get();

    }

    public static  String  getString(Supplier<String>  sup){
        return sup.get();

    }

    public static void main(String[] args) {
        String aa = getString(()->"胡歌");
        System.out.println("aaa----"+aa);

        Integer[]  array = {1,2,99,4,6};

        int maxValue =  getMax(()->{
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if(array[i]>max){
                    max = array[i];
                }
            }
            return max;
        });

        System.out.println("maxValue----"+maxValue);
    }



}
