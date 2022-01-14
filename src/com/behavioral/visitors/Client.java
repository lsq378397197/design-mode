package com.behavioral.visitors;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问角色保持不变（被访问者，访问行为可以多变）
 *
 * @author liushangqing
 * @date 2022/1/10 22:16
 */
public class Client {
    public static void main(String[] args) {
        List<Element> elementList = new ArrayList<>();
        ElementA elementA = new ElementA();
        elementA.setState(11);
        ElementB elementB = new ElementB();
        elementB.setState(12);
        elementList.add(elementA);
        elementList.add(elementB);
        for (Element element :elementList) {
            element.accept(new VisitBehavior());
        }
    }
}
