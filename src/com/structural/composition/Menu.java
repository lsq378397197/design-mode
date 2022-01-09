package com.structural.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单项，下面可以有子菜单或者文件
 *
 * @author liushangqing
 * @date 2022/1/9 19:28
 */
public class Menu extends MenuComponent{
    private List<MenuComponent> menus = new ArrayList<>();
    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent component) {
        menus.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menus.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menus.get(i);
    }

    @Override
    public void print(){
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent m : menus) {
            m.print();
        }
    }

}
