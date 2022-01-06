package com.creational.prototype;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:11
 */
public class PrototypeB implements PrototypeInterface{
    @Override
    public PrototypeB clone() throws CloneNotSupportedException {
        System.out.println("clone new object:B");
        return (PrototypeB)super.clone();
    }
}
