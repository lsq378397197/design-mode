package com.structural.proxy;

/**
 * ้ๆไปฃ็
 *
 * @author liushangqing
 * @date 2022/1/7 7:27
 */
public class Client {
    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        ProxyObject proxyObject = new ProxyObject(realObject);
        proxyObject.run();
    }
}
