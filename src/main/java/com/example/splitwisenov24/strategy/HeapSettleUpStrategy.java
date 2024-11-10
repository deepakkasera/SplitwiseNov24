package com.example.splitwisenov24.strategy;

import com.example.splitwisenov24.models.Expense;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HeapSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Expense> settleUp(List<Expense> expenses) {
        //Implement this algorithm using Min and Max Heap.
        return new ArrayList<>();
    }
}
