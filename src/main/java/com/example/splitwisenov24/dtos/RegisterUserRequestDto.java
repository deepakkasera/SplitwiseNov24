package com.example.splitwisenov24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequestDto {
    private String username;
    private String phoneNumber;
    private String password;
}
