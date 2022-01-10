package com.structural.proxy;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/10 21:45
 */
public class RealObject implements Fitness{
    @Override
    public void run() {
        System.out.println("跑步");
    }
}
