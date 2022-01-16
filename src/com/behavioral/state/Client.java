package com.behavioral.state;

/**
 * 状态模式
 *
 * @author liushangqing
 * @date 2022/1/16 13:33
 */
public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        GUI ui = new GUI(player);
        ui.init();
    }
}
