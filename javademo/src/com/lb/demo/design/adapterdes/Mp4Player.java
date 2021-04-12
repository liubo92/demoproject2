package com.lb.demo.design.adapterdes;

/**
 * @author lb
 * @create 2021-04-12 23:48
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void palyMp3( String fileName) {


    }

    @Override
    public void palyMp4( String fileName) {
        System.out.println("paly  mp4 ========>>>"+fileName+" 视频");

    }
}
