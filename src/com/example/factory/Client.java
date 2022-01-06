package com.example.factory;

/**
 * 客户端
 *
 * @author liushangqing
 * @date 2022/1/6 21:27
 */
public class Client {
    public static void main(String[] args) {
        IProduct a = ProductFactory.createProduct("a");
        a.apply();

        IProduct b = ProductFactory.createProduct("b");
        b.apply();
    }
}
