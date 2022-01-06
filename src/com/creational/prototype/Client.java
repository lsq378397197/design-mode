package com.creational.prototype;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:12
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeA originalA = new PrototypeA();
        System.out.println(originalA);

        PrototypeA newInstanceA =  originalA.clone();
        System.out.println(newInstanceA);
    }
}
