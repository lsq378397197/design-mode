package com.structural.adaptor;

/**
 * 定义适配器类，220V交流电转typec 12V电
 * 继承或者持有目标接口的引用
 * @author liushangqing
 * @date 2022/1/8 16:25
 */
public class AcSocketAdaptorTypec extends TypecImpl implements AcSocket {
    @Override
    public String useAc() {
        System.out.println("使用转换器转换完成");
        return userTypecSocket();
    }
}
