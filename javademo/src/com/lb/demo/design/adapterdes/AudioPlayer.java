package com.lb.demo.design.adapterdes;

/**
 * @author lb
 * @create 2021-04-12 23:34
 */
public class AudioPlayer implements MediaPlayer{
        private  MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String fileName) {
        if("mp3".equals(type)|| "mp4".equals(type) ){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,fileName);
        }else {
            System.out.println("播放 其他格式");
        }
    }
}
