package com.structural.adaptor;

/**
 * typec 实现类
 *
 * @author liushangqing
 * @date 2022/1/8 16:20
 */
public class TypecImpl implements TypecSocket{
    @Override
    public String userTypecSocket() {
        return "使用type C接口充电...";
    }
}
