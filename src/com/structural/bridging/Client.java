package com.structural.bridging;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:26
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Laptop(new DellBrand());
        computer.info();
        System.out.println("================================");
        Computer hpDesktop = new Desktop(new HpBrand());
        hpDesktop.info();
    }
}
