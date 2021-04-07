package com.lb.demo.annotation;

/**
 * 计算类
 * @author lb
 * @create 2021-03-11
 */
public class Calculator {
    @Check
    public void add(){
        System.out.println(" 1+1 ="+(1/0));
    }
}
