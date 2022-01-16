package com.behavioral.state;

import java.util.ArrayList;
import java.util.List;

/**
 * 音乐播放器
 *
 * @author liushangqing
 * @date 2022/1/16 13:34
 */
public class Player {
    private State state;
    private boolean playing = false;
    private List<String> musicList = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 10; i++) {
            musicList.add("Track " + i);
        }
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isPlaying() {
        return playing;
    }



    public String startPlayback() {
        return "Playing " + musicList.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > musicList.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + musicList.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = musicList.size() - 1;
        }
        return "Playing " + musicList.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
