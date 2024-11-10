package com.example.splitwisenov24.controllers;

import com.example.splitwisenov24.dtos.AddMemberRequestDto;
import com.example.splitwisenov24.dtos.RegisterUserRequestDto;
import com.example.splitwisenov24.dtos.RegisterUserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    public RegisterUserResponseDto registerUser(RegisterUserRequestDto requestDto) {
        System.out.println("Register user command");
        return null;
    }

    public ResponseEntity<Void> addMember(AddMemberRequestDto requestDto) {
        return null;
    }
}
