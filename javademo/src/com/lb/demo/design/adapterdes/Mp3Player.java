package com.lb.demo.design.adapterdes;

/**
 * @author lb
 * @create 2021-04-12 23:48
 */
public class Mp3Player implements AdvancedMediaPlayer{
    @Override
    public void palyMp3( String fileName) {
        System.out.println("paly mp3 =======>>>"+fileName+" 音乐");

    }

    @Override
    public void palyMp4(String fileName) {

    }
}
