package com.behavioral.command;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/18 22:06
 */
public class HtmlEditor implements Editor{
    @Override
    public void open() {
        System.out.println("html open");
    }

    @Override
    public void save() {
        System.out.println("html save");
    }
}
