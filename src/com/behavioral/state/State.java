package com.behavioral.state;

/**
 * Common interface for all states.
 *
 * @author liushangqing
 * @date 2022/1/16 13:34
 */
public abstract class State {
    Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
