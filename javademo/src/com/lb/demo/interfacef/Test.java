package com.lb.demo.interfacef;

import com.lb.demo.interfacef.impl.MyfunctionInterfaceImpl;

/**
 * @author lb
 * @create 2021-03-08
 */
public class Test {

    public static  void  show(MyfunctionInterface myfunctionInterface){
        myfunctionInterface.method();

    }

    public static void main(String[] args) {
        // 直接传递 接口实现类对象
        show( new MyfunctionInterfaceImpl());
        //传递匿名内部类
        show(new MyfunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类。。。。");
            }
        });

        // lambda表达式
        show(()->{
            System.out.println("使用lambda表达式。。。。");
        });

        show(()->
            System.out.println("使用lambda表达式。。。。简化版本")
        );

        new Thread(()->
            System.out.println("hello")
        ,"threadOne").run();
    }
}
