package com.lb.demo.reflect;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author lb
 * @create 2021-03-10
 */
public class ReflectInstance {
    public static void main(String[] args) throws Exception {

        //加载配置文件
        Properties pro = new Properties();
        //获取类加载
        ClassLoader classLoader = ReflectInstance.class.getClassLoader();
        //读取文件流
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        //加载文件进入内存
        pro.load(resourceAsStream);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        Class<?> cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);


    }
}
