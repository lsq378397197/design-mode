package com.creational.singleton;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:04
 */
public class Client {
    public static void main(String[] args) {
        Singleton.INSTANCE.hello();
    }
}
