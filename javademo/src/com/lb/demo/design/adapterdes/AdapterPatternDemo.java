package com.lb.demo.design.adapterdes;

/**
 * @author lb
 * @create 2021-04-12 23:34
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","千千万万");


        audioPlayer.play("mp4","飞狗moco");

        audioPlayer.play("mp5","飞狗moco+千千万万");






    }
}
