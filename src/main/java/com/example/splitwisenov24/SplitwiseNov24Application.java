package com.example.splitwisenov24;

import com.example.splitwisenov24.commands.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseNov24Application {

    public static void main(String[] args) {

        SpringApplication.run(SplitwiseNov24Application.class, args);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Waiting for user input.....");
            String input = scanner.nextLine();
            CommandExecutor.execute(input);
        }
    }

}
