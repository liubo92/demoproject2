package com.lb.demo.reflect;

/**
 * @author lb
 * @create 2021-03-10
 */
public class Person {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void say() {
        System.out.println("person......private");
    }

    public void sayHello() {
        System.out.println("person......public.....方法执行....");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
