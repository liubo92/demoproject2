package com.lb.demo.design.adapterdes;

/**
 * @author lb
 * @create 2021-04-12 23:34
 */
public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("mp3".equals(audioType)){
            this.advancedMediaPlayer = new Mp3Player();
        }else if("mp4".equals(audioType)){
            this.advancedMediaPlayer = new Mp4Player();

        }
    }

    @Override
    public void play(String type, String fileName) {
        if("mp3".equals(type)){
            advancedMediaPlayer.palyMp3(fileName);
        }else if("mp4".equals(type)){
            advancedMediaPlayer.palyMp4(fileName);
        }
    }
}
