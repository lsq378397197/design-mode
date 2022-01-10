package com.structural.flyweight;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/7 7:27
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.getShape("circle");
        Shape circle2 = factory.getShape("circle");
        System.out.println(circle.getShape());
        System.out.println(circle==circle2);
    }

}
