package com.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/18 22:10
 */
public class WebEditFlow {
    private final List<Command> commands;

    public WebEditFlow() {
        this.commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void run() {
        commands.forEach(Command::execute);
    }
}
