package com.example.factory;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/6 21:20
 */
public class ProductA implements IProduct{
    @Override
    public void apply() {
        System.out.println("use product A");
    }
}
