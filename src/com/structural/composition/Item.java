package com.structural.composition;

/**
 * 叶子节点，文件
 *
 * @author liushangqing
 * @date 2022/1/9 19:37
 */
public class Item extends MenuComponent{
    public Item(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
