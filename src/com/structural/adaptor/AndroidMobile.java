package com.structural.adaptor;

/**
 * 安卓手机充电
 *
 * @author liushangqing
 * @date 2022/1/8 16:30
 */
public class AndroidMobile {
    public String useAcSocket(AcSocket acSocket){
        if (acSocket == null) {
            throw new NullPointerException("SD card Null");
        }
        return acSocket.useAc();
    }
}
