package com.example.splitwisenov24.commands;

public interface Command {
    boolean matches(String input);

    void execute(String input);
}
