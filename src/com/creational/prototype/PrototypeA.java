package com.creational.prototype;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:09
 */
public class PrototypeA implements PrototypeInterface{
    @Override
    public PrototypeA clone() throws CloneNotSupportedException {
        System.out.println("Cloning new object: A");
        return (PrototypeA) super.clone();
    }
}
