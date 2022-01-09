package com.structural.decoration;

/**
 * 基础手抓饼
 *
 * @author liushangqing
 * @date 2022/1/9 20:26
 */
public class BasePancake implements Pancake{
    @Override
    public String getMsg() {
        return "基础手抓饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
