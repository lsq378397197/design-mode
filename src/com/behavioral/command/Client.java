package com.behavioral.command;

/**
 * 命令模式
 *
 * @author liushangqing
 * @date 2022/1/18 22:11
 */
public class Client {
    public static void main(String[] args) {
        HtmlEditor htmlEditor = new HtmlEditor();
        MarkdownEditor markdownEditor = new MarkdownEditor();
        Open htmlOpen = new Open(htmlEditor);
        Open markdownOpen = new Open(markdownEditor);
        Save htmlSave = new Save(htmlEditor);
        Save markdownSave = new Save(markdownEditor);
        WebEditFlow webEditFlow = new WebEditFlow();
        webEditFlow.setCommand(htmlOpen);
        webEditFlow.setCommand(htmlSave);
        webEditFlow.setCommand(markdownOpen);
        webEditFlow.setCommand(markdownSave);
        webEditFlow.run();

    }
}
