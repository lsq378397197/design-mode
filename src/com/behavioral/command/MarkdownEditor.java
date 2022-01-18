package com.behavioral.command;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/18 22:05
 */
public class MarkdownEditor implements Editor{
    @Override
    public void open() {
        System.out.println("markdown open");
    }

    @Override
    public void save() {
        System.out.println("markdown save");
    }
}
