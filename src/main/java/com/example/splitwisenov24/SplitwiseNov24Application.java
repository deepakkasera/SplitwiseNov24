package com.example.splitwisenov24;

import com.example.splitwisenov24.commands.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseNov24Application {
    private static CommandExecutor commandExecutor;

    public SplitwiseNov24Application(CommandExecutor commandExecutor) {
        commandExecutor = commandExecutor;
    }

    public static void main(String[] args) {

        SpringApplication.run(SplitwiseNov24Application.class, args);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            commandExecutor.execute(input);
        }
    }

}
