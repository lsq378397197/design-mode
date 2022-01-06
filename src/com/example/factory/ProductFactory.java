package com.example.factory;

/**
 * 工厂类
 *
 * @author liushangqing
 * @date 2022/1/6 21:21
 */
public class ProductFactory {

    public static IProduct createProduct(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return new ProductA();
        }
        return new ProductB();
    }
}
