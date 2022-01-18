package com.behavioral.command;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/18 22:03
 */
public class Open implements Command{
    private Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.open();
    }
}
