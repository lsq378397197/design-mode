package com.structural.adaptor;

/**
 * 交流电充电
 *
 * @author liushangqing
 * @date 2022/1/8 16:23
 */
public class AcSocketImpl implements AcSocket{
    @Override
    public String useAc() {
        return "使用220V交流电充电";
    }
}
