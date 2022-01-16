package com.behavioral.memento;

/**
 * 备忘录模式
 *
 * @author liushangqing
 * @date 2022/1/16 16:11
 */
public class Client {
    public static void main(String[] args) {
        Blog blog = new Blog("1", "testTitle");
        blog.setContent("blog content");

        //创建blog的备忘录
        BlogMemento memento = blog.createMemento();
        blog.setContent("xxxx");
        System.out.println(blog);
        //撤销操作
        blog.restore(memento);
        System.out.println(blog);


    }
}
