package com.example.abstracts.factory;

/**
 * 小米笔记本电脑
 *
 * @author liushangqing
 * @date 2022/1/5 21:36
 */
public class MiMobile implements Mobile{
    @Override
    public Mobile create() {
        System.out.println("生产了小米电脑");
        return new MiMobile();
    }
}
