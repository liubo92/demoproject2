package com.lb.demo.thread.proandcus;

/**
 *包子资源类
 *
 * @author lb
 * @create 2021-03-20
 */
public class Baozi {
    private  boolean flag = false;
    private  String pi;
    private  String xian;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public Baozi() {
    }

    public Baozi(boolean flag, String pi, String xian) {
        this.flag = flag;
        this.pi = pi;
        this.xian = xian;
    }
}
