package com.structural.proxy;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/10 21:46
 */
public class ProxyObject implements Fitness{
    private RealObject realObject;

    public ProxyObject(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void run() {
        prepare();
        realObject.run();
        runAfter();
    }

    public void prepare(){
        System.out.println("跑前热身。。。");
    }

    public void runAfter(){
        System.out.println("跑后拉伸。。。");
    }
}
