package com.behavioral.command;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/18 22:09
 */
public class Save implements Command{
    private Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editor.save();
    }
}
