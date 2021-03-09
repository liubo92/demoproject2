package com.lb.demo.interfacef.impl;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * @author lb
 * @create 2021-03-08
 */
public class DemoComparator {
    public static Comparator<String> getComparator() {
//        return  new Comparator<String>() {
//            @Override
//            public int compare(String o1,String o2) {
//                return o2.length()-o1.length();
//            }
//        };
        return (o1, o2) -> o2.length() - o1.length();

    }
    public static  int getMax(Supplier<Integer>  sup){
        return sup.get();

    }

    public static  String  getString(Supplier<String>  sup){
        return sup.get();

    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "b", "ccccc", "gggggg"};
        System.out.println("排序前的arr"+ Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println("排序后的arr"+ Arrays.toString(arr));
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
