package com.structural.facade;

/**
 * 门面角色类
 *
 * @author liushangqing
 * @date 2022/1/7 7:27
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
