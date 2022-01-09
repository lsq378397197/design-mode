package com.structural.composition;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:27
 */
public class Client {
    public static void main(String[] args) {
        Menu m1 = new Menu("系统管理", 1);
        Menu m2 = new Menu("菜单管理", 2);
        Menu m3 = new Menu("权限配置", 2);
        Item item1 = new Item("页面访问", 3);
        Item item2 = new Item("权限页面", 3);
        m1.add(m2);
        m1.add(m3);
        m2.add(item1);
        m3.add(item2);
        m1.print();
    }
}
