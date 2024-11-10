package com.example.splitwisenov24.strategy;

import com.example.splitwisenov24.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses);
}
