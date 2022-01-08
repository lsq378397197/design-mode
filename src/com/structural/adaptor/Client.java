package com.structural.adaptor;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:25
 */
public class Client {
    public static void main(String[] args) {
        AndroidMobile mobile = new AndroidMobile();
        AcSocket acSocket = new AcSocketImpl();
        System.out.println(mobile.useAcSocket(acSocket));
        System.out.println("=================================");
        AcSocketAdaptorTypec adaptor = new AcSocketAdaptorTypec();
        System.out.println(mobile.useAcSocket(adaptor));
    }
}
