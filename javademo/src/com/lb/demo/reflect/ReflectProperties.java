package com.lb.demo.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author lb
 * @create 2021-03-11
 */
@SuppressWarnings("all")
public class ReflectProperties {

    public static void main(String[] args) throws Exception {
        //文件读取

        Properties properties = new Properties();
        //获取类加载器
        ClassLoader classLoader = ReflectProperties.class.getClassLoader();

        InputStream resourceAsStream = classLoader.getResourceAsStream("lb.properties");
        //加载文件到内存
        properties.load(resourceAsStream);
        //        //解析文件
        String className = properties.getProperty("className");
        String  method= properties.getProperty("method");
        Class<?> aClass = Class.forName(className);

        //反射执行方法
        Object o = aClass.newInstance();
        Method method1 = aClass.getMethod(method);
        method1.invoke(o);


    }
}
