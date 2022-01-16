package com.behavioral.memento;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/16 16:11
 */
public class Blog {
    private String id;
    private String title;
    private String content;

    public Blog(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public BlogMemento createMemento() {
        BlogMemento m = new BlogMemento(id, title, content);
        return m;
    }

    public void restore(BlogMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
