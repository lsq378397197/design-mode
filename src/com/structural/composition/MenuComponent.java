package com.structural.composition;

/**
 * 菜单抽象
 *
 * @author liushangqing
 * @date 2022/1/9 19:25
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }


}
