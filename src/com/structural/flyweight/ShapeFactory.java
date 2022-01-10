package com.structural.flyweight;

import java.util.HashMap;

/**
 * 工厂类
 *
 * @author liushangqing
 * @date 2022/1/10 20:41
 */
public class ShapeFactory {
    private HashMap<String, Shape> map;    //在构造方法中初始化

    private ShapeFactory() {
        map = new HashMap<String, Shape>();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        map.put("circle", circle);
        map.put("triangle", triangle);
    }

    //声明一个方法获取工厂
    public static ShapeFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ShapeFactory INSTANCE = new ShapeFactory();
    }

    //根据图形名称获取图形对象
    public Shape getShape(String name) {
        return map.get(name);
    }
}
