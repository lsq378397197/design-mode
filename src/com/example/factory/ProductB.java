package com.example.factory;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/6 21:21
 */
public class ProductB implements IProduct{
    @Override
    public void apply() {
        System.out.println("user product B");
    }
}
