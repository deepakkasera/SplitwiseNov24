package com.example.splitwisenov24.commands;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandExecutor {
    private AddMemberCommand addMemberCommand;
    private AddGroupCommand addGroupCommand;
    private SettleUpUserCommand settleUpUserCommand;

    private List<Command> commands = new ArrayList<>();

    public CommandExecutor(AddMemberCommand addMemberCommand,
                           AddGroupCommand addGroupCommand,
                           SettleUpUserCommand settleUpUserCommand) {
        this.addMemberCommand = addMemberCommand;
        this.addGroupCommand = addGroupCommand;
        this.settleUpUserCommand = settleUpUserCommand;

        commands.add(addMemberCommand);
        commands.add(addGroupCommand);
        commands.add(settleUpUserCommand);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(
                command
        );
    }

    public void execute(String input) {
        for (Command command : commands) {
            if (command.matches(input)) {
                command.execute(input);
                break;
            }
        }
    }
}
