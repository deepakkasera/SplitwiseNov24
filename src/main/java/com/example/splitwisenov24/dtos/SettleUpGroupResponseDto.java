package com.example.splitwisenov24.dtos;

import com.example.splitwisenov24.models.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponseDto {
    private List<Expense> expenses;
}
