package com.example.splitwisenov24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddMemberRequestDto {
    private Long adminId;
    private Long userId;
    private Long groupId;
}
