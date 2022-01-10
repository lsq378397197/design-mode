package com.structural.facade;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/10 20:12
 */
public class Facade {
    public void test(){
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}
