package com.example.abstracts.factory;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/5 21:41
 */
public class HuaweiMobile implements Mobile{
    @Override
    public Mobile create() {
        System.out.println("生产华为手机");
        return new HuaweiMobile();
    }
}
