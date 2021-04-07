package com.lb.demo.annotation;

import com.sun.corba.se.impl.ior.IORTemplateImpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lb
 * @create 2021-03-11
 */
public class TestManno {
    public static void main(String[] args) throws IOException {
        //1、创建对象
        Calculator calculator = new Calculator();

        //2、获取字节码对象
        Class<? extends Calculator> aClass = calculator.getClass();
        BufferedWriter bfw = new BufferedWriter(new FileWriter("bug.txt"));
        int num = 0;
        //3、获取所有的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    num++;
                    bfw.write(method.getName()+"方法出现异常");
                    bfw.newLine();
                    bfw.write("异常名称"+e.getClass().getSimpleName());
                    bfw.newLine();
                    bfw.write("异常名称"+e.getCause().getMessage());
                    bfw.newLine();
                }

            }
            
        }
        bfw.write("--------------------");
        bfw.newLine();
        bfw.write("本次执行一共出现："+num+"异常");
        bfw.newLine();
        bfw.flush();
        bfw.close();






    }
}
