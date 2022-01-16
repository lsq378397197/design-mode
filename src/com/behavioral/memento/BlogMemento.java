package com.behavioral.memento;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/16 16:12
 */
public class BlogMemento {
    private String id;
    private String title;
    private String content;

    public BlogMemento(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
